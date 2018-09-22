////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Garmin Canada Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2018 Garmin Canada Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 20.74Release
// Tag = production/akw/20.74.01-0-ge94e71c
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;

import java.util.HashMap;
import java.util.Map;

public class WarmUpExerciseName {
    public static final int QUADRUPED_ROCKING = 0;
    public static final int NECK_TILTS = 1;
    public static final int ANKLE_CIRCLES = 2;
    public static final int ANKLE_DORSIFLEXION_WITH_BAND = 3;
    public static final int ANKLE_INTERNAL_ROTATION = 4;
    public static final int ARM_CIRCLES = 5;
    public static final int BENT_OVER_REACH_TO_SKY = 6;
    public static final int CAT_CAMEL = 7;
    public static final int ELBOW_TO_FOOT_LUNGE = 8;
    public static final int FORWARD_AND_BACKWARD_LEG_SWINGS = 9;
    public static final int GROINERS = 10;
    public static final int INVERTED_HAMSTRING_STRETCH = 11;
    public static final int LATERAL_DUCK_UNDER = 12;
    public static final int NECK_ROTATIONS = 13;
    public static final int OPPOSITE_ARM_AND_LEG_BALANCE = 14;
    public static final int REACH_ROLL_AND_LIFT = 15;
    public static final int SCORPION = 16;
    public static final int SHOULDER_CIRCLES = 17;
    public static final int SIDE_TO_SIDE_LEG_SWINGS = 18;
    public static final int SLEEPER_STRETCH = 19;
    public static final int SLIDE_OUT = 20;
    public static final int SWISS_BALL_HIP_CROSSOVER = 21;
    public static final int SWISS_BALL_REACH_ROLL_AND_LIFT = 22;
    public static final int SWISS_BALL_WINDSHIELD_WIPERS = 23;
    public static final int THORACIC_ROTATION = 24;
    public static final int WALKING_HIGH_KICKS = 25;
    public static final int WALKING_HIGH_KNEES = 26;
    public static final int WALKING_KNEE_HUGS = 27;
    public static final int WALKING_LEG_CRADLES = 28;
    public static final int WALKOUT = 29;
    public static final int WALKOUT_FROM_PUSH_UP_POSITION = 30;
    public static final int INVALID = Fit.UINT16_INVALID;

    private static final Map<Integer, String> stringMap;

    static {
        stringMap = new HashMap<Integer, String>();
        stringMap.put(QUADRUPED_ROCKING, "QUADRUPED_ROCKING");
        stringMap.put(NECK_TILTS, "NECK_TILTS");
        stringMap.put(ANKLE_CIRCLES, "ANKLE_CIRCLES");
        stringMap.put(ANKLE_DORSIFLEXION_WITH_BAND, "ANKLE_DORSIFLEXION_WITH_BAND");
        stringMap.put(ANKLE_INTERNAL_ROTATION, "ANKLE_INTERNAL_ROTATION");
        stringMap.put(ARM_CIRCLES, "ARM_CIRCLES");
        stringMap.put(BENT_OVER_REACH_TO_SKY, "BENT_OVER_REACH_TO_SKY");
        stringMap.put(CAT_CAMEL, "CAT_CAMEL");
        stringMap.put(ELBOW_TO_FOOT_LUNGE, "ELBOW_TO_FOOT_LUNGE");
        stringMap.put(FORWARD_AND_BACKWARD_LEG_SWINGS, "FORWARD_AND_BACKWARD_LEG_SWINGS");
        stringMap.put(GROINERS, "GROINERS");
        stringMap.put(INVERTED_HAMSTRING_STRETCH, "INVERTED_HAMSTRING_STRETCH");
        stringMap.put(LATERAL_DUCK_UNDER, "LATERAL_DUCK_UNDER");
        stringMap.put(NECK_ROTATIONS, "NECK_ROTATIONS");
        stringMap.put(OPPOSITE_ARM_AND_LEG_BALANCE, "OPPOSITE_ARM_AND_LEG_BALANCE");
        stringMap.put(REACH_ROLL_AND_LIFT, "REACH_ROLL_AND_LIFT");
        stringMap.put(SCORPION, "SCORPION");
        stringMap.put(SHOULDER_CIRCLES, "SHOULDER_CIRCLES");
        stringMap.put(SIDE_TO_SIDE_LEG_SWINGS, "SIDE_TO_SIDE_LEG_SWINGS");
        stringMap.put(SLEEPER_STRETCH, "SLEEPER_STRETCH");
        stringMap.put(SLIDE_OUT, "SLIDE_OUT");
        stringMap.put(SWISS_BALL_HIP_CROSSOVER, "SWISS_BALL_HIP_CROSSOVER");
        stringMap.put(SWISS_BALL_REACH_ROLL_AND_LIFT, "SWISS_BALL_REACH_ROLL_AND_LIFT");
        stringMap.put(SWISS_BALL_WINDSHIELD_WIPERS, "SWISS_BALL_WINDSHIELD_WIPERS");
        stringMap.put(THORACIC_ROTATION, "THORACIC_ROTATION");
        stringMap.put(WALKING_HIGH_KICKS, "WALKING_HIGH_KICKS");
        stringMap.put(WALKING_HIGH_KNEES, "WALKING_HIGH_KNEES");
        stringMap.put(WALKING_KNEE_HUGS, "WALKING_KNEE_HUGS");
        stringMap.put(WALKING_LEG_CRADLES, "WALKING_LEG_CRADLES");
        stringMap.put(WALKOUT, "WALKOUT");
        stringMap.put(WALKOUT_FROM_PUSH_UP_POSITION, "WALKOUT_FROM_PUSH_UP_POSITION");
    }


    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value, or empty if unknown
     */
    public static String getStringFromValue( Integer value ) {
        if( stringMap.containsKey( value ) ) {
            return stringMap.get( value );
        }

        return "";
    }

    /**
     * Retrieves a value given a string representation
     * @return The value or INVALID if unkwown
     */
    public static Integer getValueFromString( String value ) {
        for( Map.Entry<Integer, String> entry : stringMap.entrySet() ) {
            if( entry.getValue().equals( value ) ) {
                return entry.getKey();
            }
        }

        return INVALID;
    }

}
