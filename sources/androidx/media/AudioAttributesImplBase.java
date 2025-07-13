package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements androidx.media.AudioAttributesImpl {

    /* renamed from: a */
    public int f2579a;

    /* renamed from: b */
    public int f2580b;

    /* renamed from: c */
    public int f2581c;

    /* renamed from: d */
    public int f2582d;

    public AudioAttributesImplBase() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2579a = r0
            r1.f2580b = r0
            r1.f2581c = r0
            r0 = -1
            r1.f2582d = r0
            return
    }

    public boolean equals(java.lang.Object r11) {
            r10 = this;
            boolean r0 = r11 instanceof androidx.media.AudioAttributesImplBase
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.media.AudioAttributesImplBase r11 = (androidx.media.AudioAttributesImplBase) r11
            int r0 = r10.f2580b
            int r2 = r11.f2580b
            r3 = 1
            if (r0 != r2) goto L58
            int r0 = r10.f2581c
            int r2 = r11.f2581c
            int r4 = r11.f2582d
            r5 = -1
            r6 = 7
            r7 = 6
            r8 = 4
            if (r4 == r5) goto L1d
            r8 = r4
            goto L40
        L1d:
            int r5 = r11.f2579a
            int r9 = androidx.media.AudioAttributesCompat.f2575b
            r9 = r2 & 1
            if (r9 != r3) goto L27
            r8 = 7
            goto L40
        L27:
            r9 = r2 & 4
            if (r9 != r8) goto L2d
            r8 = 6
            goto L40
        L2d:
            switch(r5) {
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L40;
                case 5: goto L38;
                case 6: goto L36;
                case 7: goto L38;
                case 8: goto L38;
                case 9: goto L38;
                case 10: goto L38;
                case 11: goto L33;
                case 12: goto L30;
                case 13: goto L31;
                default: goto L30;
            }
        L30:
            goto L3f
        L31:
            r8 = 1
            goto L40
        L33:
            r8 = 10
            goto L40
        L36:
            r8 = 2
            goto L40
        L38:
            r8 = 5
            goto L40
        L3a:
            r8 = 8
            goto L40
        L3d:
            r8 = 0
            goto L40
        L3f:
            r8 = 3
        L40:
            if (r8 != r7) goto L45
            r2 = r2 | 4
            goto L49
        L45:
            if (r8 != r6) goto L49
            r2 = r2 | 1
        L49:
            r2 = r2 & 273(0x111, float:3.83E-43)
            if (r0 != r2) goto L58
            int r0 = r10.f2579a
            int r11 = r11.f2579a
            if (r0 != r11) goto L58
            int r11 = r10.f2582d
            if (r11 != r4) goto L58
            r1 = 1
        L58:
            return r1
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.f2580b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.f2581c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.f2579a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r1 = r3.f2582d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AudioAttributesCompat:"
            r0.<init>(r1)
            int r1 = r3.f2582d
            r2 = -1
            if (r1 == r2) goto L1b
            java.lang.String r1 = " stream="
            r0.append(r1)
            int r1 = r3.f2582d
            r0.append(r1)
            java.lang.String r1 = " derived"
            r0.append(r1)
        L1b:
            java.lang.String r1 = " usage="
            r0.append(r1)
            int r1 = r3.f2579a
            int r2 = androidx.media.AudioAttributesCompat.f2575b
            switch(r1) {
                case 0: goto L5b;
                case 1: goto L58;
                case 2: goto L55;
                case 3: goto L52;
                case 4: goto L4f;
                case 5: goto L4c;
                case 6: goto L49;
                case 7: goto L46;
                case 8: goto L43;
                case 9: goto L40;
                case 10: goto L3d;
                case 11: goto L3a;
                case 12: goto L37;
                case 13: goto L34;
                case 14: goto L31;
                case 15: goto L27;
                case 16: goto L2e;
                default: goto L27;
            }
        L27:
            java.lang.String r2 = "unknown usage "
            java.lang.String r1 = android.support.v4.media.C0142a.m254a(r2, r1)
            goto L5d
        L2e:
            java.lang.String r1 = "USAGE_ASSISTANT"
            goto L5d
        L31:
            java.lang.String r1 = "USAGE_GAME"
            goto L5d
        L34:
            java.lang.String r1 = "USAGE_ASSISTANCE_SONIFICATION"
            goto L5d
        L37:
            java.lang.String r1 = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE"
            goto L5d
        L3a:
            java.lang.String r1 = "USAGE_ASSISTANCE_ACCESSIBILITY"
            goto L5d
        L3d:
            java.lang.String r1 = "USAGE_NOTIFICATION_EVENT"
            goto L5d
        L40:
            java.lang.String r1 = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED"
            goto L5d
        L43:
            java.lang.String r1 = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT"
            goto L5d
        L46:
            java.lang.String r1 = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST"
            goto L5d
        L49:
            java.lang.String r1 = "USAGE_NOTIFICATION_RINGTONE"
            goto L5d
        L4c:
            java.lang.String r1 = "USAGE_NOTIFICATION"
            goto L5d
        L4f:
            java.lang.String r1 = "USAGE_ALARM"
            goto L5d
        L52:
            java.lang.String r1 = "USAGE_VOICE_COMMUNICATION_SIGNALLING"
            goto L5d
        L55:
            java.lang.String r1 = "USAGE_VOICE_COMMUNICATION"
            goto L5d
        L58:
            java.lang.String r1 = "USAGE_MEDIA"
            goto L5d
        L5b:
            java.lang.String r1 = "USAGE_UNKNOWN"
        L5d:
            r0.append(r1)
            java.lang.String r1 = " content="
            r0.append(r1)
            int r1 = r3.f2580b
            r0.append(r1)
            java.lang.String r1 = " flags=0x"
            r0.append(r1)
            int r1 = r3.f2581c
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r1 = r1.toUpperCase()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
