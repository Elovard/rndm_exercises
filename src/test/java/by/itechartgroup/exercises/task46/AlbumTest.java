package by.itechartgroup.exercises.task46;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlbumTest {

    @ParameterizedTest
    @MethodSource
    void whenSongIsNotExist_ThenNewSongShouldBeAdded(String title, double duration) {
        Album album = new Album("Test Album", "Test Band");
        assertTrue(album.addSong(title, duration));
    }

    private static Stream<Arguments> whenSongIsNotExist_ThenNewSongShouldBeAdded() {
        return Stream.of(
                Arguments.of("new song", 2.33),
                Arguments.of("test song", 2.55),
                Arguments.of("cool song", 3.12)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenSongExists_ThenNewSongShouldNotBeAdded(String title, double duration) {
        Album album = new Album("Test Album", "Test Band");
        album.addSong("new song", 2.33);
        album.addSong("cool song", 2.33);
        assertFalse(album.addSong(title, duration));
    }

    private static Stream<Arguments> whenSongExists_ThenNewSongShouldNotBeAdded() {
        return Stream.of(
                Arguments.of("new song", 2.33),
                Arguments.of("cool song", 3.12)
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenIndexIsGreaterThanSizeOfPlayList_ThenResultShouldBeFalse(int trackNumber, LinkedList<Song> playlist) {
        Album album = new Album("Test Album", "Test Band");
        assertFalse(album.addToPlayList(trackNumber, playlist));
    }

    private static Stream<Arguments> whenIndexIsGreaterThanSizeOfPlayList_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of(10, new LinkedList<Song>()),
                Arguments.of(15, new LinkedList<Song>())
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenIndexIsLessThanSizeOfPlayList_ThenResultShouldBeTrue(int trackNumber, LinkedList<Song> playlist) {
        Album album = new Album("Test Album", "Test Band");
        album.addSong("test song1", 1.0d);
        album.addSong("test song2", 4.0d);
        album.addSong("test song3", 3.0d);
        assertTrue(album.addToPlayList(trackNumber, playlist));
    }

    private static Stream<Arguments> whenIndexIsLessThanSizeOfPlayList_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of(1, new LinkedList<Song>()),
                Arguments.of(2, new LinkedList<Song>()),
                Arguments.of(3, new LinkedList<Song>())
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenSongByTitleIsNotInTheAlbum_ThenResultShouldBeFalse(String songTitle, LinkedList<Song> playlist) {
        Album album = new Album("Test Album", "Test Band");
        assertFalse(album.addToPlayList(songTitle, playlist));
    }

    private static Stream<Arguments> whenSongByTitleIsNotInTheAlbum_ThenResultShouldBeFalse() {
        return Stream.of(
                Arguments.of("no such song", new LinkedList<Song>()),
                Arguments.of("test song", new LinkedList<Song>()),
                Arguments.of("cool song", new LinkedList<Song>())
        );
    }

    @ParameterizedTest
    @MethodSource
    void whenSongByTitleIsInTheAlbum_ThenResultShouldBeTrue(String songTitle, LinkedList<Song> playlist) {
        Album album = new Album("Test Album", "Test Band");
        album.addSong("great song", 1.0);
        album.addSong("new hit", 2.0);
        album.addSong("pop song", 5.0);
        assertTrue(album.addToPlayList(songTitle, playlist));
    }

    private static Stream<Arguments> whenSongByTitleIsInTheAlbum_ThenResultShouldBeTrue() {
        return Stream.of(
                Arguments.of("great song", new LinkedList<Song>()),
                Arguments.of("new hit", new LinkedList<Song>()),
                Arguments.of("pop song", new LinkedList<Song>())
        );
    }

}