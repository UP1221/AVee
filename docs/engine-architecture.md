# Avee Visualizer Architecture

Root (t75)
|
+-- Composition (zi0)
|     |
|     +-- AudioProvider (jr)
|     +-- Image (zh2)
|     +-- Bars (nh5)
|     +-- Text (p76)
|     +-- Particles (u94)
|     +-- BlurEffect (zz)
|     +-- MotionBlurEffect (rs3)
|     +-- MirrorEffect (zq3)
|     +-- RgbSplitEffect (v65)
|     +-- AppLogo (be3)
|     +-- StatText (uz1)
|     +-- CustomShader (au0)
|
+-- Composition References
|     composition:0
|     composition:1
|     composition:N
|
+-- Render Targets (rs6)
|
+-- OpenGL Shader Pipeline
      cm5
        ↓
      ws6
        ↓
      q35 renderer

