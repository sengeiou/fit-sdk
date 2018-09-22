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
import java.math.BigInteger;


public class VideoFrameMesg extends Mesg {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int TimestampMsFieldNum = 0;
    
    public static final int FrameNumberFieldNum = 1;
    

    protected static final  Mesg videoFrameMesg;
    static {
        // video_frame
        videoFrameMesg = new Mesg("video_frame", MesgNum.VIDEO_FRAME);
        videoFrameMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "s", false, Profile.Type.DATE_TIME));
        
        videoFrameMesg.addField(new Field("timestamp_ms", TimestampMsFieldNum, 132, 1, 0, "ms", false, Profile.Type.UINT16));
        
        videoFrameMesg.addField(new Field("frame_number", FrameNumberFieldNum, 134, 1, 0, "", false, Profile.Type.UINT32));
        
    }

    public VideoFrameMesg() {
        super(Factory.createMesg(MesgNum.VIDEO_FRAME));
    }

    public VideoFrameMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get timestamp field
     * Units: s
     * Comment: Whole second part of the timestamp
     *
     * @return timestamp
     */
    public DateTime getTimestamp() {
        return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set timestamp field
     * Units: s
     * Comment: Whole second part of the timestamp
     *
     * @param timestamp
     */
    public void setTimestamp(DateTime timestamp) {
        setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get timestamp_ms field
     * Units: ms
     * Comment: Millisecond part of the timestamp.
     *
     * @return timestamp_ms
     */
    public Integer getTimestampMs() {
        return getFieldIntegerValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set timestamp_ms field
     * Units: ms
     * Comment: Millisecond part of the timestamp.
     *
     * @param timestampMs
     */
    public void setTimestampMs(Integer timestampMs) {
        setFieldValue(0, 0, timestampMs, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get frame_number field
     * Comment: Number of the frame that the timestamp and timestamp_ms correlate to
     *
     * @return frame_number
     */
    public Long getFrameNumber() {
        return getFieldLongValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set frame_number field
     * Comment: Number of the frame that the timestamp and timestamp_ms correlate to
     *
     * @param frameNumber
     */
    public void setFrameNumber(Long frameNumber) {
        setFieldValue(1, 0, frameNumber, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
