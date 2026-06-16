# Open Avee Specification

## Engine Tree

Root
└── Composition
    ├── AudioProvider
    ├── Image
    ├── Bars
    ├── Text
    ├── Particles
    ├── BlurEffect
    ├── MotionBlurEffect
    ├── MirrorEffect
    ├── RgbSplitEffect
    ├── AppLogo
    ├── StatText
    └── CustomShader

## Registries

### Audio Providers
- Waveform
- Spectrum
- Spectrum2

### Shape Paths
- HorizontalLine
- Circle
- SidedPolygon
- Letter
- Year

### Segment Types
- None
- Bars
- Line
- SharpBars
- RoundBars

## Shader System

CustomShader
- shaderVertex
- shaderFragment
- variables
- textures

## Preset Format

Root
Composition
Elements

## Render Pipeline

Root
 -> Composition
 -> Elements
 -> Framebuffer
 -> Screen
