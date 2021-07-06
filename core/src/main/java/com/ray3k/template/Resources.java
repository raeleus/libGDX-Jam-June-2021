package com.ray3k.template;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.esotericsoftware.spine.Animation;
import com.esotericsoftware.spine.AnimationStateData;
import com.esotericsoftware.spine.SkeletonData;
import java.lang.String;

public class Resources {
    public static Skin skin_skin;

    public static TextureAtlas textures_textures;

    public static Sound sfx_click;

    public static Sound sfx_draDraDra;

    public static Sound sfx_electronicAccess;

    public static Sound sfx_introPistol;

    public static Sound sfx_lineABunchOfUseless;

    public static Sound sfx_lineACollectionOf;

    public static Sound sfx_lineAConstantReminder;

    public static Sound sfx_lineAJumbleOf;

    public static Sound sfx_lineAQueenHas;

    public static Sound sfx_lineAhhThatsIt;

    public static Sound sfx_lineAnAddictiveNarcotic;

    public static Sound sfx_lineAnArrayOf;

    public static Sound sfx_lineAnIndustrialFridge;

    public static Sound sfx_lineAndJustLike;

    public static Sound sfx_lineApparentlyThisWas;

    public static Sound sfx_lineCommonMeetingArea;

    public static Sound sfx_lineCutToTheChase;

    public static Sound sfx_lineDammitLooksLike;

    public static Sound sfx_lineDamnTheKiller;

    public static Sound sfx_lineDieLibgdxScum;

    public static Sound sfx_lineDoILookLike;

    public static Sound sfx_lineDoctorMgsxHead;

    public static Sound sfx_lineDryingTheChemical;

    public static Sound sfx_lineEmptyMustBe;

    public static Sound sfx_lineEssentialSuppliesAnd;

    public static Sound sfx_lineEverythingHereIs;

    public static Sound sfx_lineExperimentationInThe;

    public static Sound sfx_lineFancyTechnologicalContraption;

    public static Sound sfx_lineGotEm;

    public static Sound sfx_lineGreatForCleaning;

    public static Sound sfx_lineHelloHelloNeed;

    public static Sound sfx_lineHeySugah;

    public static Sound sfx_lineHmmAMechanical;

    public static Sound sfx_lineHopefullySomebodyWill;

    public static Sound sfx_lineHuhASecret;

    public static Sound sfx_lineICantLeave;

    public static Sound sfx_lineINeedMyAmmo;

    public static Sound sfx_lineINeedSomethingTo;

    public static Sound sfx_lineINeedToPack;

    public static Sound sfx_lineIPullMy;

    public static Sound sfx_lineIShouldEquip;

    public static Sound sfx_lineIThinkTheCookstaff;

    public static Sound sfx_lineITurnToHang;

    public static Sound sfx_lineIWouldDestroy;

    public static Sound sfx_lineIllNeverGet;

    public static Sound sfx_lineImNotCarrying;

    public static Sound sfx_lineImSorryThat;

    public static Sound sfx_lineIsThatYouSlick2d;

    public static Sound sfx_lineItsDarkI;

    public static Sound sfx_lineJuneTwentiethWhy;

    public static Sound sfx_lineJustWhenI;

    public static Sound sfx_lineLeadsToThe;

    public static Sound sfx_lineLoadedImFeeling;

    public static Sound sfx_lineLooksLikeOil;

    public static Sound sfx_lineMahoganyWhereDid;

    public static Sound sfx_lineMaybeThatHalf;

    public static Sound sfx_lineMostOfThe;

    public static Sound sfx_lineMyGodWhat;

    public static Sound sfx_lineMyOfficeIf;

    public static Sound sfx_lineNooneEverSuspects;

    public static Sound sfx_lineNooneIsComingInto;

    public static Sound sfx_lineOilStainsThey;

    public static Sound sfx_lineOrMaybeSomething;

    public static Sound sfx_linePandaNeverHad;

    public static Sound sfx_linePandaStayWith;

    public static Sound sfx_linePeanutPandaNo;

    public static Sound sfx_linePeopleShouldClean;

    public static Sound sfx_linePipeAnEngineering;

    public static Sound sfx_linePrimaryLoadingBay;

    public static Sound sfx_lineProductionIsDown;

    public static Sound sfx_lineShipLifeIs;

    public static Sound sfx_lineSlashWoundsIt;

    public static Sound sfx_lineSomethingCameThrough;

    public static Sound sfx_lineSomethingSmellsRotten;

    public static Sound sfx_lineSubjectDischargesA;

    public static Sound sfx_lineSubjectHasEscaped;

    public static Sound sfx_lineThankfullyImCovered;

    public static Sound sfx_lineTheClockTicks;

    public static Sound sfx_lineTheDayDraws;

    public static Sound sfx_lineTheDoorIsSecured;

    public static Sound sfx_lineTheLowerDecks;

    public static Sound sfx_lineTheMainGenerator;

    public static Sound sfx_lineTheOfficeOf;

    public static Sound sfx_lineThePerpCame;

    public static Sound sfx_lineTheShipIs;

    public static Sound sfx_lineTheSurroundingTissue;

    public static Sound sfx_lineTheTelltaleMarkings;

    public static Sound sfx_lineTheVerifierHigh;

    public static Sound sfx_lineTheWoundIs;

    public static Sound sfx_lineThereSheIs;

    public static Sound sfx_lineTheyNeverGave;

    public static Sound sfx_lineTheySayTime;

    public static Sound sfx_lineTheyreOperatingOut;

    public static Sound sfx_lineThisFloorIs;

    public static Sound sfx_lineThisIsNot;

    public static Sound sfx_lineThisIsVeryDamning;

    public static Sound sfx_lineThisIsntATime;

    public static Sound sfx_lineThoseCrooksYou;

    public static Sound sfx_lineThoughtfulPancakes;

    public static Sound sfx_lineTickTock;

    public static Sound sfx_lineTraitorLooksLike;

    public static Sound sfx_lineUghIDontThink;

    public static Sound sfx_lineUssLibgdx;

    public static Sound sfx_lineVerticalTakeOff;

    public static Sound sfx_lineVortexRoundsIt;

    public static Sound sfx_lineWhatTheDoor;

    public static Sound sfx_lineYeahWhatsIt;

    public static Sound sfx_lineYouThinkYou;

    public static Sound sfx_lineZebraWhy;

    public static Sound sfx_machineGun;

    public static Sound sfx_pin;

    public static Sound sfx_revolver;

    public static Sound sfx_unlock;

    public static Sound sfx_zzz;

    public static Music bgm_action;

    public static Music bgm_audioSample;

    public static Music bgm_game;

    public static Music bgm_libgdx;

    public static Music bgm_menu;

    public static void loadResources(AssetManager assetManager) {
        skin_skin = assetManager.get("skin/skin.json");
        SpineAirLock.skeletonData = assetManager.get("spine/air-lock.json");
        SpineAirLock.animationData = assetManager.get("spine/air-lock.json-animation");
        SpineAirLock.animationDoor = SpineAirLock.skeletonData.findAnimation("door");
        SpineAirLock.animationWindow = SpineAirLock.skeletonData.findAnimation("window");
        SpineAirLock.skinDefault = SpineAirLock.skeletonData.findSkin("default");
        SpineAmbush.skeletonData = assetManager.get("spine/ambush.json");
        SpineAmbush.animationData = assetManager.get("spine/ambush.json-animation");
        SpineAmbush.animationAnimation = SpineAmbush.skeletonData.findAnimation("animation");
        SpineAmbush.animationStand = SpineAmbush.skeletonData.findAnimation("stand");
        SpineBody.skeletonData = assetManager.get("spine/body.json");
        SpineBody.animationData = assetManager.get("spine/body.json-animation");
        SpineBody.animationAnimation = SpineBody.skeletonData.findAnimation("animation");
        SpineBody.skinDefault = SpineBody.skeletonData.findSkin("default");
        SpineBody1.skeletonData = assetManager.get("spine/body1.json");
        SpineBody1.animationData = assetManager.get("spine/body1.json-animation");
        SpineBody1.animationAnimation = SpineBody1.skeletonData.findAnimation("animation");
        SpineBody1.skinDefault = SpineBody1.skeletonData.findSkin("default");
        SpineBody2.skeletonData = assetManager.get("spine/body2.json");
        SpineBody2.animationData = assetManager.get("spine/body2.json-animation");
        SpineBody2.animationAnimation = SpineBody2.skeletonData.findAnimation("animation");
        SpineBody2.skinDefault = SpineBody2.skeletonData.findSkin("default");
        SpineCabinet.skeletonData = assetManager.get("spine/cabinet.json");
        SpineCabinet.animationData = assetManager.get("spine/cabinet.json-animation");
        SpineCabinet.animationBoltCutters = SpineCabinet.skeletonData.findAnimation("bolt-cutters");
        SpineCabinet.animationCleaners = SpineCabinet.skeletonData.findAnimation("cleaners");
        SpineCabinet.animationNoBoltCutters = SpineCabinet.skeletonData.findAnimation("no-bolt-cutters");
        SpineCabinet.animationToolbox = SpineCabinet.skeletonData.findAnimation("toolbox");
        SpineCabinet.skinDefault = SpineCabinet.skeletonData.findSkin("default");
        SpineClock.skeletonData = assetManager.get("spine/clock.json");
        SpineClock.animationData = assetManager.get("spine/clock.json-animation");
        SpineClock.animationNine = SpineClock.skeletonData.findAnimation("nine");
        SpineClock.animationSeconds = SpineClock.skeletonData.findAnimation("seconds");
        SpineClock.animationThree = SpineClock.skeletonData.findAnimation("three");
        SpineClock.animationTwo = SpineClock.skeletonData.findAnimation("two");
        SpineClock.skinDefault = SpineClock.skeletonData.findSkin("default");
        SpineCommons.skeletonData = assetManager.get("spine/commons.json");
        SpineCommons.animationData = assetManager.get("spine/commons.json-animation");
        SpineCommons.animationArrow = SpineCommons.skeletonData.findAnimation("arrow");
        SpineCommons.animationElevator = SpineCommons.skeletonData.findAnimation("elevator");
        SpineCommons.animationEngineering = SpineCommons.skeletonData.findAnimation("engineering");
        SpineCommons.animationMessHall = SpineCommons.skeletonData.findAnimation("mess-hall");
        SpineCommons.animationPoster = SpineCommons.skeletonData.findAnimation("poster");
        SpineCommons.animationReceiving = SpineCommons.skeletonData.findAnimation("receiving");
        SpineCommons.skinDefault = SpineCommons.skeletonData.findSkin("default");
        SpineCrew.skeletonData = assetManager.get("spine/crew.json");
        SpineCrew.animationData = assetManager.get("spine/crew.json-animation");
        SpineCrew.animationArrow = SpineCrew.skeletonData.findAnimation("arrow");
        SpineCrew.animationBody = SpineCrew.skeletonData.findAnimation("body");
        SpineCrew.animationEscapePod = SpineCrew.skeletonData.findAnimation("escape-pod");
        SpineCrew.animationGraffiti = SpineCrew.skeletonData.findAnimation("graffiti");
        SpineCrew.skinDefault = SpineCrew.skeletonData.findSkin("default");
        SpineDarkHallway.skeletonData = assetManager.get("spine/dark-hallway.json");
        SpineDarkHallway.animationData = assetManager.get("spine/dark-hallway.json-animation");
        SpineDarkHallway.animationArrow = SpineDarkHallway.skeletonData.findAnimation("arrow");
        SpineDarkHallway.animationExit = SpineDarkHallway.skeletonData.findAnimation("exit");
        SpineDarkHallway.animationPanda = SpineDarkHallway.skeletonData.findAnimation("panda");
        SpineDarkHallway.skinDefault = SpineDarkHallway.skeletonData.findSkin("default");
        SpineDesk.skeletonData = assetManager.get("spine/desk.json");
        SpineDesk.animationData = assetManager.get("spine/desk.json-animation");
        SpineDesk.animationAnimation = SpineDesk.skeletonData.findAnimation("animation");
        SpineDesk.skinDefault = SpineDesk.skeletonData.findSkin("default");
        SpineEngineering1.skeletonData = assetManager.get("spine/engineering1.json");
        SpineEngineering1.animationData = assetManager.get("spine/engineering1.json-animation");
        SpineEngineering1.animationArrow = SpineEngineering1.skeletonData.findAnimation("arrow");
        SpineEngineering1.animationCrewDoor = SpineEngineering1.skeletonData.findAnimation("crew-door");
        SpineEngineering1.animationGraffiti = SpineEngineering1.skeletonData.findAnimation("graffiti");
        SpineEngineering1.animationGrease = SpineEngineering1.skeletonData.findAnimation("grease");
        SpineEngineering1.animationLadder = SpineEngineering1.skeletonData.findAnimation("ladder");
        SpineEngineering1.animationPrinter = SpineEngineering1.skeletonData.findAnimation("printer");
        SpineEngineering1.skinDefault = SpineEngineering1.skeletonData.findSkin("default");
        SpineEngineering2.skeletonData = assetManager.get("spine/engineering2.json");
        SpineEngineering2.animationData = assetManager.get("spine/engineering2.json-animation");
        SpineEngineering2.animationAnimation = SpineEngineering2.skeletonData.findAnimation("animation");
        SpineEngineering2.animationCrate = SpineEngineering2.skeletonData.findAnimation("crate");
        SpineEngineering2.animationDone = SpineEngineering2.skeletonData.findAnimation("done");
        SpineEngineering2.animationDoorway = SpineEngineering2.skeletonData.findAnimation("doorway");
        SpineEngineering2.animationLadder = SpineEngineering2.skeletonData.findAnimation("ladder");
        SpineEngineering2.animationLight = SpineEngineering2.skeletonData.findAnimation("light");
        SpineEngineering2.animationNoLight = SpineEngineering2.skeletonData.findAnimation("no-light");
        SpineEngineering2.animationReactor = SpineEngineering2.skeletonData.findAnimation("reactor");
        SpineEngineering2.animationShooting = SpineEngineering2.skeletonData.findAnimation("shooting");
        SpineEngineering2.skinDefault = SpineEngineering2.skeletonData.findSkin("default");
        SpineFabricator.skeletonData = assetManager.get("spine/fabricator.json");
        SpineFabricator.animationData = assetManager.get("spine/fabricator.json-animation");
        SpineFabricator.animationAnimation = SpineFabricator.skeletonData.findAnimation("animation");
        SpineFabricator.skinDefault = SpineFabricator.skeletonData.findSkin("default");
        SpineHallway.skeletonData = assetManager.get("spine/hallway.json");
        SpineHallway.animationData = assetManager.get("spine/hallway.json-animation");
        SpineHallway.animationArrow = SpineHallway.skeletonData.findAnimation("arrow");
        SpineHallway.animationDoor = SpineHallway.skeletonData.findAnimation("door");
        SpineHallway.animationSchematic = SpineHallway.skeletonData.findAnimation("schematic");
        SpineHallway.skinDefault = SpineHallway.skeletonData.findSkin("default");
        SpineIntro.skeletonData = assetManager.get("spine/intro.json");
        SpineIntro.animationData = assetManager.get("spine/intro.json-animation");
        SpineIntro.animationAnimation = SpineIntro.skeletonData.findAnimation("animation");
        SpineIntro.animationStand = SpineIntro.skeletonData.findAnimation("stand");
        SpineIntro.skinDefault = SpineIntro.skeletonData.findSkin("default");
        SpineKeypad.skeletonData = assetManager.get("spine/keypad.json");
        SpineKeypad.animationData = assetManager.get("spine/keypad.json-animation");
        SpineKeypad.animationAnimation = SpineKeypad.skeletonData.findAnimation("animation");
        SpineKeypad.skinDefault = SpineKeypad.skeletonData.findSkin("default");
        SpineKitchen.skeletonData = assetManager.get("spine/kitchen.json");
        SpineKitchen.animationData = assetManager.get("spine/kitchen.json-animation");
        SpineKitchen.animationArrow = SpineKitchen.skeletonData.findAnimation("arrow");
        SpineKitchen.animationCabinet = SpineKitchen.skeletonData.findAnimation("cabinet");
        SpineKitchen.animationCounter = SpineKitchen.skeletonData.findAnimation("counter");
        SpineKitchen.animationPancakes = SpineKitchen.skeletonData.findAnimation("pancakes");
        SpineKitchen.animationRefrigerator = SpineKitchen.skeletonData.findAnimation("refrigerator");
        SpineKitchen.skinDefault = SpineKitchen.skeletonData.findSkin("default");
        SpineLab.skeletonData = assetManager.get("spine/lab.json");
        SpineLab.animationData = assetManager.get("spine/lab.json-animation");
        SpineLab.animationArrow = SpineLab.skeletonData.findAnimation("arrow");
        SpineLab.animationBalls = SpineLab.skeletonData.findAnimation("balls");
        SpineLab.animationDoor = SpineLab.skeletonData.findAnimation("door");
        SpineLab.animationEquipment = SpineLab.skeletonData.findAnimation("equipment");
        SpineLab.animationNotes = SpineLab.skeletonData.findAnimation("notes");
        SpineLab.skinDefault = SpineLab.skeletonData.findSkin("default");
        SpineLibgdx.skeletonData = assetManager.get("spine/libgdx.json");
        SpineLibgdx.animationData = assetManager.get("spine/libgdx.json-animation");
        SpineLibgdx.animationAnimation = SpineLibgdx.skeletonData.findAnimation("animation");
        SpineLibgdx.animationStand = SpineLibgdx.skeletonData.findAnimation("stand");
        SpineLibgdx.animationZebra = SpineLibgdx.skeletonData.findAnimation("zebra");
        SpineLibgdx.skinDefault = SpineLibgdx.skeletonData.findSkin("default");
        SpineMeal.skeletonData = assetManager.get("spine/meal.json");
        SpineMeal.animationData = assetManager.get("spine/meal.json-animation");
        SpineMeal.animationAnimation = SpineMeal.skeletonData.findAnimation("animation");
        SpineMeal.skinDefault = SpineMeal.skeletonData.findSkin("default");
        SpineMechanicalLock.skeletonData = assetManager.get("spine/mechanical-lock.json");
        SpineMechanicalLock.animationData = assetManager.get("spine/mechanical-lock.json-animation");
        SpineMechanicalLock.animationBobbyPin = SpineMechanicalLock.skeletonData.findAnimation("bobby-pin");
        SpineMechanicalLock.animationBroken = SpineMechanicalLock.skeletonData.findAnimation("broken");
        SpineMechanicalLock.animationClose = SpineMechanicalLock.skeletonData.findAnimation("close");
        SpineMechanicalLock.animationFar = SpineMechanicalLock.skeletonData.findAnimation("far");
        SpineMechanicalLock.animationNoBobbyPin = SpineMechanicalLock.skeletonData.findAnimation("no-bobby-pin");
        SpineMechanicalLock.animationNoScrewdriver = SpineMechanicalLock.skeletonData.findAnimation("no-screwdriver");
        SpineMechanicalLock.animationUnlocked = SpineMechanicalLock.skeletonData.findAnimation("unlocked");
        SpineMechanicalLock.skinDefault = SpineMechanicalLock.skeletonData.findSkin("default");
        SpineMessHall.skeletonData = assetManager.get("spine/mess-hall.json");
        SpineMessHall.animationData = assetManager.get("spine/mess-hall.json-animation");
        SpineMessHall.animationArrow = SpineMessHall.skeletonData.findAnimation("arrow");
        SpineMessHall.animationClock = SpineMessHall.skeletonData.findAnimation("clock");
        SpineMessHall.animationKitchen = SpineMessHall.skeletonData.findAnimation("kitchen");
        SpineMessHall.animationMeal = SpineMessHall.skeletonData.findAnimation("meal");
        SpineMessHall.animationNoMeal = SpineMessHall.skeletonData.findAnimation("no-meal");
        SpineMessHall.animationNote = SpineMessHall.skeletonData.findAnimation("note");
        SpineMessHall.skinDefault = SpineMessHall.skeletonData.findSkin("default");
        SpineNotes.skeletonData = assetManager.get("spine/notes.json");
        SpineNotes.animationData = assetManager.get("spine/notes.json-animation");
        SpineNotes.animationAnimation = SpineNotes.skeletonData.findAnimation("animation");
        SpineNotes.skinDefault = SpineNotes.skeletonData.findSkin("default");
        SpineOffice.skeletonData = assetManager.get("spine/office.json");
        SpineOffice.animationData = assetManager.get("spine/office.json-animation");
        SpineOffice.animationArrow = SpineOffice.skeletonData.findAnimation("arrow");
        SpineOffice.animationClock = SpineOffice.skeletonData.findAnimation("clock");
        SpineOffice.animationDesk = SpineOffice.skeletonData.findAnimation("desk");
        SpineOffice.animationFilingCabinet = SpineOffice.skeletonData.findAnimation("filing-cabinet");
        SpineOffice.animationPlant = SpineOffice.skeletonData.findAnimation("plant");
        SpineOffice.animationWindow = SpineOffice.skeletonData.findAnimation("window");
        SpineOffice.skinDefault = SpineOffice.skeletonData.findSkin("default");
        SpinePancakes.skeletonData = assetManager.get("spine/pancakes.json");
        SpinePancakes.animationData = assetManager.get("spine/pancakes.json-animation");
        SpinePancakes.animationAnimation = SpinePancakes.skeletonData.findAnimation("animation");
        SpinePancakes.skinDefault = SpinePancakes.skeletonData.findSkin("default");
        SpinePeanutPanda.skeletonData = assetManager.get("spine/peanut-panda.json");
        SpinePeanutPanda.animationData = assetManager.get("spine/peanut-panda.json-animation");
        SpinePeanutPanda.animationAnimation = SpinePeanutPanda.skeletonData.findAnimation("animation");
        SpinePeanutPanda.animationStand = SpinePeanutPanda.skeletonData.findAnimation("stand");
        SpinePeanutPanda.skinDefault = SpinePeanutPanda.skeletonData.findSkin("default");
        SpinePlant.skeletonData = assetManager.get("spine/plant.json");
        SpinePlant.animationData = assetManager.get("spine/plant.json-animation");
        SpinePlant.animationAnimation = SpinePlant.skeletonData.findAnimation("animation");
        SpinePlant.skinDefault = SpinePlant.skeletonData.findSkin("default");
        SpinePortHole.skeletonData = assetManager.get("spine/port-hole.json");
        SpinePortHole.animationData = assetManager.get("spine/port-hole.json-animation");
        SpinePortHole.animationAnimation = SpinePortHole.skeletonData.findAnimation("animation");
        SpinePortHole.skinDefault = SpinePortHole.skeletonData.findSkin("default");
        SpinePoster.skeletonData = assetManager.get("spine/poster.json");
        SpinePoster.animationData = assetManager.get("spine/poster.json-animation");
        SpinePoster.animationAnimation = SpinePoster.skeletonData.findAnimation("animation");
        SpinePoster.skinDefault = SpinePoster.skeletonData.findSkin("default");
        SpineReceiving.skeletonData = assetManager.get("spine/receiving.json");
        SpineReceiving.animationData = assetManager.get("spine/receiving.json-animation");
        SpineReceiving.animationAnimation = SpineReceiving.skeletonData.findAnimation("animation");
        SpineReceiving.animationArrow = SpineReceiving.skeletonData.findAnimation("arrow");
        SpineReceiving.animationStorage1 = SpineReceiving.skeletonData.findAnimation("storage1");
        SpineReceiving.animationStorage2 = SpineReceiving.skeletonData.findAnimation("storage2");
        SpineReceiving.animationStorage3 = SpineReceiving.skeletonData.findAnimation("storage3");
        SpineReceiving.animationStorage4 = SpineReceiving.skeletonData.findAnimation("storage4");
        SpineReceiving.animationVtol = SpineReceiving.skeletonData.findAnimation("vtol");
        SpineReceiving.skinDefault = SpineReceiving.skeletonData.findSkin("default");
        SpineSchematic.skeletonData = assetManager.get("spine/schematic.json");
        SpineSchematic.animationData = assetManager.get("spine/schematic.json-animation");
        SpineSchematic.animationAnimation = SpineSchematic.skeletonData.findAnimation("animation");
        SpineSchematic.skinDefault = SpineSchematic.skeletonData.findSkin("default");
        SpineStorageLock.skeletonData = assetManager.get("spine/storage-lock.json");
        SpineStorageLock.animationData = assetManager.get("spine/storage-lock.json-animation");
        SpineStorageLock.animationAnimation = SpineStorageLock.skeletonData.findAnimation("animation");
        SpineStorageLock.skinDefault = SpineStorageLock.skeletonData.findSkin("default");
        SpineStorage1.skeletonData = assetManager.get("spine/storage1.json");
        SpineStorage1.animationData = assetManager.get("spine/storage1.json-animation");
        SpineStorage1.animationAnimation = SpineStorage1.skeletonData.findAnimation("animation");
        SpineStorage1.skinDefault = SpineStorage1.skeletonData.findSkin("default");
        SpineStorage2.skeletonData = assetManager.get("spine/storage2.json");
        SpineStorage2.animationData = assetManager.get("spine/storage2.json-animation");
        SpineStorage2.animationNotebook = SpineStorage2.skeletonData.findAnimation("notebook");
        SpineStorage2.skinDefault = SpineStorage2.skeletonData.findSkin("default");
        SpineStorage3.skeletonData = assetManager.get("spine/storage3.json");
        SpineStorage3.animationData = assetManager.get("spine/storage3.json-animation");
        SpineStorage3.animationBalls = SpineStorage3.skeletonData.findAnimation("balls");
        SpineStorage3.animationBody1 = SpineStorage3.skeletonData.findAnimation("body1");
        SpineStorage3.animationBody2 = SpineStorage3.skeletonData.findAnimation("body2");
        SpineStorage3.animationGrease = SpineStorage3.skeletonData.findAnimation("grease");
        SpineStorage3.skinDefault = SpineStorage3.skeletonData.findSkin("default");
        SpineStorage4.skeletonData = assetManager.get("spine/storage4.json");
        SpineStorage4.animationData = assetManager.get("spine/storage4.json-animation");
        SpineStorage4.animationClock = SpineStorage4.skeletonData.findAnimation("clock");
        SpineStorage4.skinDefault = SpineStorage4.skeletonData.findSkin("default");
        SpineWindow.skeletonData = assetManager.get("spine/window.json");
        SpineWindow.animationData = assetManager.get("spine/window.json-animation");
        SpineWindow.animationAnimation = SpineWindow.skeletonData.findAnimation("animation");
        SpineWindow.animationBlink = SpineWindow.skeletonData.findAnimation("blink");
        SpineWindow.animationSpeech = SpineWindow.skeletonData.findAnimation("speech");
        SpineWindow.animationStand = SpineWindow.skeletonData.findAnimation("stand");
        SpineWindow.skinDefault = SpineWindow.skeletonData.findSkin("default");
        textures_textures = assetManager.get("textures/textures.atlas");
        sfx_click = assetManager.get("sfx/click.mp3");
        sfx_draDraDra = assetManager.get("sfx/dra dra dra.mp3");
        sfx_electronicAccess = assetManager.get("sfx/electronic access.mp3");
        sfx_introPistol = assetManager.get("sfx/intro-pistol.mp3");
        sfx_lineABunchOfUseless = assetManager.get("sfx/line a bunch of useless.mp3");
        sfx_lineACollectionOf = assetManager.get("sfx/line a collection of.mp3");
        sfx_lineAConstantReminder = assetManager.get("sfx/line a constant reminder.mp3");
        sfx_lineAJumbleOf = assetManager.get("sfx/line a jumble of.mp3");
        sfx_lineAQueenHas = assetManager.get("sfx/line a queen has.mp3");
        sfx_lineAhhThatsIt = assetManager.get("sfx/line ahh thats it.mp3");
        sfx_lineAnAddictiveNarcotic = assetManager.get("sfx/line an addictive narcotic.mp3");
        sfx_lineAnArrayOf = assetManager.get("sfx/line an array of.mp3");
        sfx_lineAnIndustrialFridge = assetManager.get("sfx/line an industrial fridge.mp3");
        sfx_lineAndJustLike = assetManager.get("sfx/line and just like.mp3");
        sfx_lineApparentlyThisWas = assetManager.get("sfx/line apparently this was.mp3");
        sfx_lineCommonMeetingArea = assetManager.get("sfx/line common meeting area.mp3");
        sfx_lineCutToTheChase = assetManager.get("sfx/line cut to the chase.mp3");
        sfx_lineDammitLooksLike = assetManager.get("sfx/line dammit looks like.mp3");
        sfx_lineDamnTheKiller = assetManager.get("sfx/line damn the killer.mp3");
        sfx_lineDieLibgdxScum = assetManager.get("sfx/line die libgdx scum.mp3");
        sfx_lineDoILookLike = assetManager.get("sfx/line do i look like.mp3");
        sfx_lineDoctorMgsxHead = assetManager.get("sfx/line doctor mgsx head.mp3");
        sfx_lineDryingTheChemical = assetManager.get("sfx/line drying the chemical.mp3");
        sfx_lineEmptyMustBe = assetManager.get("sfx/line empty must be.mp3");
        sfx_lineEssentialSuppliesAnd = assetManager.get("sfx/line essential supplies and.mp3");
        sfx_lineEverythingHereIs = assetManager.get("sfx/line everything here is.mp3");
        sfx_lineExperimentationInThe = assetManager.get("sfx/line experimentation in the.mp3");
        sfx_lineFancyTechnologicalContraption = assetManager.get("sfx/line fancy technological contraption.mp3");
        sfx_lineGotEm = assetManager.get("sfx/line got em.mp3");
        sfx_lineGreatForCleaning = assetManager.get("sfx/line great for cleaning.mp3");
        sfx_lineHelloHelloNeed = assetManager.get("sfx/line hello hello need.mp3");
        sfx_lineHeySugah = assetManager.get("sfx/line hey sugah.mp3");
        sfx_lineHmmAMechanical = assetManager.get("sfx/line hmm a mechanical.mp3");
        sfx_lineHopefullySomebodyWill = assetManager.get("sfx/line hopefully somebody will.mp3");
        sfx_lineHuhASecret = assetManager.get("sfx/line huh a secret.mp3");
        sfx_lineICantLeave = assetManager.get("sfx/line I can't leave.mp3");
        sfx_lineINeedMyAmmo = assetManager.get("sfx/line I need my ammo.mp3");
        sfx_lineINeedSomethingTo = assetManager.get("sfx/line i need something to.mp3");
        sfx_lineINeedToPack = assetManager.get("sfx/line I need to pack.mp3");
        sfx_lineIPullMy = assetManager.get("sfx/line I pull my.mp3");
        sfx_lineIShouldEquip = assetManager.get("sfx/line I should equip.mp3");
        sfx_lineIThinkTheCookstaff = assetManager.get("sfx/line I think the cookstaff.mp3");
        sfx_lineITurnToHang = assetManager.get("sfx/line i turn to hang.mp3");
        sfx_lineIWouldDestroy = assetManager.get("sfx/line I would destroy.mp3");
        sfx_lineIllNeverGet = assetManager.get("sfx/line i'll never get.mp3");
        sfx_lineImNotCarrying = assetManager.get("sfx/line im not carrying.mp3");
        sfx_lineImSorryThat = assetManager.get("sfx/line im sorry that.mp3");
        sfx_lineIsThatYouSlick2d = assetManager.get("sfx/line is that you slick2d.mp3");
        sfx_lineItsDarkI = assetManager.get("sfx/line its dark i.mp3");
        sfx_lineJuneTwentiethWhy = assetManager.get("sfx/line june twentieth why.mp3");
        sfx_lineJustWhenI = assetManager.get("sfx/line just when I.mp3");
        sfx_lineLeadsToThe = assetManager.get("sfx/line leads to the.mp3");
        sfx_lineLoadedImFeeling = assetManager.get("sfx/line loaded im feeling.mp3");
        sfx_lineLooksLikeOil = assetManager.get("sfx/line looks like oil.mp3");
        sfx_lineMahoganyWhereDid = assetManager.get("sfx/line mahogany where did.mp3");
        sfx_lineMaybeThatHalf = assetManager.get("sfx/line maybe that half.mp3");
        sfx_lineMostOfThe = assetManager.get("sfx/line most of the.mp3");
        sfx_lineMyGodWhat = assetManager.get("sfx/line my god what.mp3");
        sfx_lineMyOfficeIf = assetManager.get("sfx/line my office if.mp3");
        sfx_lineNooneEverSuspects = assetManager.get("sfx/line noone ever suspects.mp3");
        sfx_lineNooneIsComingInto = assetManager.get("sfx/line noone is coming into.mp3");
        sfx_lineOilStainsThey = assetManager.get("sfx/line oil stains they.mp3");
        sfx_lineOrMaybeSomething = assetManager.get("sfx/line or maybe something.mp3");
        sfx_linePandaNeverHad = assetManager.get("sfx/line panda never had.mp3");
        sfx_linePandaStayWith = assetManager.get("sfx/line panda stay with.mp3");
        sfx_linePeanutPandaNo = assetManager.get("sfx/line peanut panda no.mp3");
        sfx_linePeopleShouldClean = assetManager.get("sfx/line people should clean.mp3");
        sfx_linePipeAnEngineering = assetManager.get("sfx/line pipe an engineering.mp3");
        sfx_linePrimaryLoadingBay = assetManager.get("sfx/line primary loading bay.mp3");
        sfx_lineProductionIsDown = assetManager.get("sfx/line production is down.mp3");
        sfx_lineShipLifeIs = assetManager.get("sfx/line ship life is.mp3");
        sfx_lineSlashWoundsIt = assetManager.get("sfx/line slash wounds it.mp3");
        sfx_lineSomethingCameThrough = assetManager.get("sfx/line something came through.mp3");
        sfx_lineSomethingSmellsRotten = assetManager.get("sfx/line something smells rotten.mp3");
        sfx_lineSubjectDischargesA = assetManager.get("sfx/line subject discharges a.mp3");
        sfx_lineSubjectHasEscaped = assetManager.get("sfx/line subject has escaped.mp3");
        sfx_lineThankfullyImCovered = assetManager.get("sfx/line thankfully im covered.mp3");
        sfx_lineTheClockTicks = assetManager.get("sfx/line the clock ticks.mp3");
        sfx_lineTheDayDraws = assetManager.get("sfx/line the day draws.mp3");
        sfx_lineTheDoorIsSecured = assetManager.get("sfx/line the door is secured.mp3");
        sfx_lineTheLowerDecks = assetManager.get("sfx/line the lower decks.mp3");
        sfx_lineTheMainGenerator = assetManager.get("sfx/line the main generator.mp3");
        sfx_lineTheOfficeOf = assetManager.get("sfx/line the office of.mp3");
        sfx_lineThePerpCame = assetManager.get("sfx/line the perp came.mp3");
        sfx_lineTheShipIs = assetManager.get("sfx/line the ship is.mp3");
        sfx_lineTheSurroundingTissue = assetManager.get("sfx/line the surrounding tissue.mp3");
        sfx_lineTheTelltaleMarkings = assetManager.get("sfx/line the telltale markings.mp3");
        sfx_lineTheVerifierHigh = assetManager.get("sfx/line the verifier high.mp3");
        sfx_lineTheWoundIs = assetManager.get("sfx/line the wound is.mp3");
        sfx_lineThereSheIs = assetManager.get("sfx/line there she is.mp3");
        sfx_lineTheyNeverGave = assetManager.get("sfx/line they never gave.mp3");
        sfx_lineTheySayTime = assetManager.get("sfx/line they say time.mp3");
        sfx_lineTheyreOperatingOut = assetManager.get("sfx/line theyre operating out.mp3");
        sfx_lineThisFloorIs = assetManager.get("sfx/line this floor is.mp3");
        sfx_lineThisIsNot = assetManager.get("sfx/line this is not.mp3");
        sfx_lineThisIsVeryDamning = assetManager.get("sfx/line this is very damning.mp3");
        sfx_lineThisIsntATime = assetManager.get("sfx/line this isnt a time.mp3");
        sfx_lineThoseCrooksYou = assetManager.get("sfx/line those crooks you.mp3");
        sfx_lineThoughtfulPancakes = assetManager.get("sfx/line thoughtful pancakes.mp3");
        sfx_lineTickTock = assetManager.get("sfx/line tick tock.mp3");
        sfx_lineTraitorLooksLike = assetManager.get("sfx/line traitor looks like.mp3");
        sfx_lineUghIDontThink = assetManager.get("sfx/line ugh i dont think.mp3");
        sfx_lineUssLibgdx = assetManager.get("sfx/line uss libgdx.mp3");
        sfx_lineVerticalTakeOff = assetManager.get("sfx/line vertical take off.mp3");
        sfx_lineVortexRoundsIt = assetManager.get("sfx/line vortex rounds it.mp3");
        sfx_lineWhatTheDoor = assetManager.get("sfx/line what the door.mp3");
        sfx_lineYeahWhatsIt = assetManager.get("sfx/line yeah what's it.mp3");
        sfx_lineYouThinkYou = assetManager.get("sfx/line you think you.mp3");
        sfx_lineZebraWhy = assetManager.get("sfx/line zebra why.mp3");
        sfx_machineGun = assetManager.get("sfx/machine-gun.mp3");
        sfx_pin = assetManager.get("sfx/pin.mp3");
        sfx_revolver = assetManager.get("sfx/revolver.mp3");
        sfx_unlock = assetManager.get("sfx/unlock.mp3");
        sfx_zzz = assetManager.get("sfx/zzz.mp3");
        bgm_action = assetManager.get("bgm/action.mp3");
        bgm_audioSample = assetManager.get("bgm/audio-sample.mp3");
        bgm_game = assetManager.get("bgm/game.mp3");
        bgm_libgdx = assetManager.get("bgm/libgdx.mp3");
        bgm_menu = assetManager.get("bgm/menu.mp3");
    }

    public static class SpineAirLock {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationDoor;

        public static Animation animationWindow;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineAmbush {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static Animation animationStand;
    }

    public static class SpineBody {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineBody1 {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineBody2 {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineCabinet {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationBoltCutters;

        public static Animation animationCleaners;

        public static Animation animationNoBoltCutters;

        public static Animation animationToolbox;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineClock {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationNine;

        public static Animation animationSeconds;

        public static Animation animationThree;

        public static Animation animationTwo;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineCommons {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationArrow;

        public static Animation animationElevator;

        public static Animation animationEngineering;

        public static Animation animationMessHall;

        public static Animation animationPoster;

        public static Animation animationReceiving;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineCrew {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationArrow;

        public static Animation animationBody;

        public static Animation animationEscapePod;

        public static Animation animationGraffiti;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineDarkHallway {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationArrow;

        public static Animation animationExit;

        public static Animation animationPanda;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineDesk {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineEngineering1 {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationArrow;

        public static Animation animationCrewDoor;

        public static Animation animationGraffiti;

        public static Animation animationGrease;

        public static Animation animationLadder;

        public static Animation animationPrinter;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineEngineering2 {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static Animation animationCrate;

        public static Animation animationDone;

        public static Animation animationDoorway;

        public static Animation animationLadder;

        public static Animation animationLight;

        public static Animation animationNoLight;

        public static Animation animationReactor;

        public static Animation animationShooting;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineFabricator {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineHallway {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationArrow;

        public static Animation animationDoor;

        public static Animation animationSchematic;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineIntro {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static Animation animationStand;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineKeypad {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineKitchen {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationArrow;

        public static Animation animationCabinet;

        public static Animation animationCounter;

        public static Animation animationPancakes;

        public static Animation animationRefrigerator;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineLab {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationArrow;

        public static Animation animationBalls;

        public static Animation animationDoor;

        public static Animation animationEquipment;

        public static Animation animationNotes;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineLibgdx {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static Animation animationStand;

        public static Animation animationZebra;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineMeal {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineMechanicalLock {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationBobbyPin;

        public static Animation animationBroken;

        public static Animation animationClose;

        public static Animation animationFar;

        public static Animation animationNoBobbyPin;

        public static Animation animationNoScrewdriver;

        public static Animation animationUnlocked;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineMessHall {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationArrow;

        public static Animation animationClock;

        public static Animation animationKitchen;

        public static Animation animationMeal;

        public static Animation animationNoMeal;

        public static Animation animationNote;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineNotes {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineOffice {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationArrow;

        public static Animation animationClock;

        public static Animation animationDesk;

        public static Animation animationFilingCabinet;

        public static Animation animationPlant;

        public static Animation animationWindow;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpinePancakes {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpinePeanutPanda {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static Animation animationStand;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpinePlant {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpinePortHole {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpinePoster {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineReceiving {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static Animation animationArrow;

        public static Animation animationStorage1;

        public static Animation animationStorage2;

        public static Animation animationStorage3;

        public static Animation animationStorage4;

        public static Animation animationVtol;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineSchematic {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineStorageLock {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineStorage1 {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineStorage2 {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationNotebook;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineStorage3 {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationBalls;

        public static Animation animationBody1;

        public static Animation animationBody2;

        public static Animation animationGrease;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineStorage4 {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationClock;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class SpineWindow {
        public static SkeletonData skeletonData;

        public static AnimationStateData animationData;

        public static Animation animationAnimation;

        public static Animation animationBlink;

        public static Animation animationSpeech;

        public static Animation animationStand;

        public static com.esotericsoftware.spine.Skin skinDefault;
    }

    public static class Values {
        public static float jumpVelocity = 10.0f;

        public static String name = "Raeleus";

        public static boolean godMode = true;

        public static int id = 10;

        public static Range speedLimitRange = new Range(0.0f, 10.0f);

        public static float speedLimit = 5.0f;
    }

    public static class Range {
        public float min;

        public float max;

        Range(float min, float max) {
            this.min = min;
            this.max = max;
        }
    }
}
