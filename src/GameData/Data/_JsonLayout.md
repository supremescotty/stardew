### Weapons.json
"Name/Description/minDamage/maxDamage/?/?/?/?/?/?/?/?/critStrikeChance/?"

### Crops.json
"stage1 stage2 stage3 stage4 ... /seasonToGrow/rowInSpriteSheet/id/reGrowAfterHarvest/scythe/trellis/canBeGiant"

### ObjectInformation.json
"Name/sellPrice/edibility/category/name/description"

#### Edibility
edibility = -300 => in-edible
The amount of health restored by a crop is `(edibility > 0) ? edibility : 0`. It is never negative.

category names:
- Basic -17: (no name displayed in game interface [Sweet Gem Berry is the only crop with this category])
- Basic -75: Vegetable
- Basic -79: Fruit
- Basic -80: Flower
- Basic -81: Forage
- Seeds -74: Seed
    
