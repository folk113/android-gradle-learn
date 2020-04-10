package util

version = new ProjectVersion(0, 1)

class ProjectVersion {
    Integer major
    Integer minor
    Boolean release

    ProjectVersion(Integer major, Integer minor) {
        this.major = major
        this.minor = minor
        this.release = Boolean.FALSE
    }

    ProjectVersion(Integer major, Integer minor, boolean release) {
        this.major = major
        this.minor = minor
        this.release = release
    }

    @Override
    String toString() {
        "$major.$minor ${release ? "" : "-SNAPSHOT"}"
    }
}