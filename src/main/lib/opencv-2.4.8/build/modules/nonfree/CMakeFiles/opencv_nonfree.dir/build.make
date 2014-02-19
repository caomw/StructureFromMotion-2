# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 2.8

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list

# Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /opt/local/bin/cmake

# The command to remove a file.
RM = /opt/local/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The program to use to edit the cache.
CMAKE_EDIT_COMMAND = /opt/local/bin/ccmake

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/lukasmartinovic/Downloads/opencv-2.4.8

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/lukasmartinovic/Downloads/opencv-2.4.8/build

# Include any dependencies generated for this target.
include modules/nonfree/CMakeFiles/opencv_nonfree.dir/depend.make

# Include the progress variables for this target.
include modules/nonfree/CMakeFiles/opencv_nonfree.dir/progress.make

# Include the compile flags for this target's objects.
include modules/nonfree/CMakeFiles/opencv_nonfree.dir/flags.make

modules/nonfree/opencl_kernels.cpp: ../modules/nonfree/src/opencl/surf.cl
modules/nonfree/opencl_kernels.cpp: ../cmake/cl2cpp.cmake
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold "Generating opencl_kernels.cpp, opencl_kernels.hpp"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /opt/local/bin/cmake -DCL_DIR="/Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/opencl" -DOUTPUT="/Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree/opencl_kernels.cpp" -P /Users/lukasmartinovic/Downloads/opencv-2.4.8/cmake/cl2cpp.cmake

modules/nonfree/opencl_kernels.hpp: modules/nonfree/opencl_kernels.cpp

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o: modules/nonfree/CMakeFiles/opencv_nonfree.dir/flags.make
modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o: ../modules/nonfree/src/nonfree_init.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/CMakeFiles $(CMAKE_PROGRESS_2)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o -c /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/nonfree_init.cpp

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.i"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/nonfree_init.cpp > CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.i

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.s"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/nonfree_init.cpp -o CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.s

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o.requires:
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o.requires

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o.provides: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o.requires
	$(MAKE) -f modules/nonfree/CMakeFiles/opencv_nonfree.dir/build.make modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o.provides.build
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o.provides

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o.provides.build: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o: modules/nonfree/CMakeFiles/opencv_nonfree.dir/flags.make
modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o: ../modules/nonfree/src/sift.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/CMakeFiles $(CMAKE_PROGRESS_3)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o -c /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/sift.cpp

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/opencv_nonfree.dir/src/sift.cpp.i"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/sift.cpp > CMakeFiles/opencv_nonfree.dir/src/sift.cpp.i

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/opencv_nonfree.dir/src/sift.cpp.s"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/sift.cpp -o CMakeFiles/opencv_nonfree.dir/src/sift.cpp.s

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o.requires:
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o.requires

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o.provides: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o.requires
	$(MAKE) -f modules/nonfree/CMakeFiles/opencv_nonfree.dir/build.make modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o.provides.build
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o.provides

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o.provides.build: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o: modules/nonfree/CMakeFiles/opencv_nonfree.dir/flags.make
modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o: ../modules/nonfree/src/surf.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/CMakeFiles $(CMAKE_PROGRESS_4)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o -c /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/surf.cpp

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/opencv_nonfree.dir/src/surf.cpp.i"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/surf.cpp > CMakeFiles/opencv_nonfree.dir/src/surf.cpp.i

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/opencv_nonfree.dir/src/surf.cpp.s"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/surf.cpp -o CMakeFiles/opencv_nonfree.dir/src/surf.cpp.s

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o.requires:
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o.requires

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o.provides: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o.requires
	$(MAKE) -f modules/nonfree/CMakeFiles/opencv_nonfree.dir/build.make modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o.provides.build
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o.provides

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o.provides.build: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o: modules/nonfree/CMakeFiles/opencv_nonfree.dir/flags.make
modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o: ../modules/nonfree/src/surf.ocl.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/CMakeFiles $(CMAKE_PROGRESS_5)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o -c /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/surf.ocl.cpp

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.i"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/surf.ocl.cpp > CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.i

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.s"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/surf.ocl.cpp -o CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.s

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o.requires:
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o.requires

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o.provides: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o.requires
	$(MAKE) -f modules/nonfree/CMakeFiles/opencv_nonfree.dir/build.make modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o.provides.build
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o.provides

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o.provides.build: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o: modules/nonfree/CMakeFiles/opencv_nonfree.dir/flags.make
modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o: ../modules/nonfree/src/surf_gpu.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/CMakeFiles $(CMAKE_PROGRESS_6)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o -c /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/surf_gpu.cpp

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.i"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/surf_gpu.cpp > CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.i

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.s"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree/src/surf_gpu.cpp -o CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.s

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o.requires:
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o.requires

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o.provides: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o.requires
	$(MAKE) -f modules/nonfree/CMakeFiles/opencv_nonfree.dir/build.make modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o.provides.build
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o.provides

modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o.provides.build: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o

modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o: modules/nonfree/CMakeFiles/opencv_nonfree.dir/flags.make
modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o: modules/nonfree/opencl_kernels.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/CMakeFiles $(CMAKE_PROGRESS_7)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o -c /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree/opencl_kernels.cpp

modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.i"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree/opencl_kernels.cpp > CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.i

modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.s"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && /usr/bin/g++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree/opencl_kernels.cpp -o CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.s

modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o.requires:
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o.requires

modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o.provides: modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o.requires
	$(MAKE) -f modules/nonfree/CMakeFiles/opencv_nonfree.dir/build.make modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o.provides.build
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o.provides

modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o.provides.build: modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o

# Object files for target opencv_nonfree
opencv_nonfree_OBJECTS = \
"CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o" \
"CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o" \
"CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o" \
"CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o" \
"CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o" \
"CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o"

# External object files for target opencv_nonfree
opencv_nonfree_EXTERNAL_OBJECTS =

lib/libopencv_nonfree.2.4.8.dylib: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o
lib/libopencv_nonfree.2.4.8.dylib: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o
lib/libopencv_nonfree.2.4.8.dylib: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o
lib/libopencv_nonfree.2.4.8.dylib: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o
lib/libopencv_nonfree.2.4.8.dylib: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o
lib/libopencv_nonfree.2.4.8.dylib: modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o
lib/libopencv_nonfree.2.4.8.dylib: modules/nonfree/CMakeFiles/opencv_nonfree.dir/build.make
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_core.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_flann.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_imgproc.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_highgui.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_features2d.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_calib3d.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_ml.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_video.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_legacy.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_objdetect.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_photo.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_gpu.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_ocl.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_legacy.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_photo.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_calib3d.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_features2d.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_flann.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_ml.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_video.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_objdetect.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_highgui.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_imgproc.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: lib/libopencv_core.2.4.8.dylib
lib/libopencv_nonfree.2.4.8.dylib: modules/nonfree/CMakeFiles/opencv_nonfree.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX shared library ../../lib/libopencv_nonfree.dylib"
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/opencv_nonfree.dir/link.txt --verbose=$(VERBOSE)
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && $(CMAKE_COMMAND) -E cmake_symlink_library ../../lib/libopencv_nonfree.2.4.8.dylib ../../lib/libopencv_nonfree.2.4.dylib ../../lib/libopencv_nonfree.dylib

lib/libopencv_nonfree.2.4.dylib: lib/libopencv_nonfree.2.4.8.dylib

lib/libopencv_nonfree.dylib: lib/libopencv_nonfree.2.4.8.dylib

# Rule to build all files generated by this target.
modules/nonfree/CMakeFiles/opencv_nonfree.dir/build: lib/libopencv_nonfree.dylib
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/build

modules/nonfree/CMakeFiles/opencv_nonfree.dir/requires: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/nonfree_init.cpp.o.requires
modules/nonfree/CMakeFiles/opencv_nonfree.dir/requires: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/sift.cpp.o.requires
modules/nonfree/CMakeFiles/opencv_nonfree.dir/requires: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.cpp.o.requires
modules/nonfree/CMakeFiles/opencv_nonfree.dir/requires: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf.ocl.cpp.o.requires
modules/nonfree/CMakeFiles/opencv_nonfree.dir/requires: modules/nonfree/CMakeFiles/opencv_nonfree.dir/src/surf_gpu.cpp.o.requires
modules/nonfree/CMakeFiles/opencv_nonfree.dir/requires: modules/nonfree/CMakeFiles/opencv_nonfree.dir/opencl_kernels.cpp.o.requires
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/requires

modules/nonfree/CMakeFiles/opencv_nonfree.dir/clean:
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree && $(CMAKE_COMMAND) -P CMakeFiles/opencv_nonfree.dir/cmake_clean.cmake
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/clean

modules/nonfree/CMakeFiles/opencv_nonfree.dir/depend: modules/nonfree/opencl_kernels.cpp
modules/nonfree/CMakeFiles/opencv_nonfree.dir/depend: modules/nonfree/opencl_kernels.hpp
	cd /Users/lukasmartinovic/Downloads/opencv-2.4.8/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/lukasmartinovic/Downloads/opencv-2.4.8 /Users/lukasmartinovic/Downloads/opencv-2.4.8/modules/nonfree /Users/lukasmartinovic/Downloads/opencv-2.4.8/build /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree /Users/lukasmartinovic/Downloads/opencv-2.4.8/build/modules/nonfree/CMakeFiles/opencv_nonfree.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : modules/nonfree/CMakeFiles/opencv_nonfree.dir/depend

