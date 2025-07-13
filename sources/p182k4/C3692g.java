package p182k4;

/* renamed from: k4.g */
/* loaded from: classes.dex */
public final class C3692g {
    /* renamed from: a */
    public static java.lang.String m8146a(int r7) {
            if (r7 == 0) goto L20f
            r0 = 2100(0x834, float:2.943E-42)
            if (r7 == r0) goto L20c
            r1 = 2103(0x837, float:2.947E-42)
            if (r7 == r1) goto L209
            r1 = 7
            if (r7 == r1) goto L206
            r2 = 8
            if (r7 == r2) goto L203
            r2 = 2200(0x898, float:3.083E-42)
            if (r7 == r2) goto L200
            r3 = 2201(0x899, float:3.084E-42)
            if (r7 == r3) goto L1fd
            switch(r7) {
                case 13: goto L1fa;
                case 14: goto L1f7;
                case 15: goto L1f4;
                default: goto L1c;
            }
        L1c:
            switch(r7) {
                case 2000: goto L1f1;
                case 2001: goto L1ee;
                case 2002: goto L1eb;
                case 2003: goto L1e8;
                case 2004: goto L1e5;
                case 2005: goto L1e2;
                case 2006: goto L1df;
                case 2007: goto L1dc;
                default: goto L1f;
            }
        L1f:
            r3 = -999(0xfffffffffffffc19, float:NaN)
            if (r7 < r3) goto L49
            r3 = 999(0x3e7, float:1.4E-42)
            if (r7 > r3) goto L49
            if (r7 == 0) goto L45
            if (r7 == r1) goto L41
            r0 = 14
            if (r7 == r0) goto L3d
            r0 = 15
            if (r7 == r0) goto L39
            java.lang.String r7 = p036c6.C0883f.m2597a(r7)
            goto L1db
        L39:
            java.lang.String r7 = "TIMEOUT"
            goto L1db
        L3d:
            java.lang.String r7 = "INTERRUPTED"
            goto L1db
        L41:
            java.lang.String r7 = "NETWORK_ERROR"
            goto L1db
        L45:
            java.lang.String r7 = "SUCCESS"
            goto L1db
        L49:
            r1 = 2000(0x7d0, float:2.803E-42)
            java.lang.String r3 = "%s %d"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r7 < r1) goto L95
            r1 = 2099(0x833, float:2.941E-42)
            if (r7 > r1) goto L95
            r0 = 2015(0x7df, float:2.824E-42)
            if (r7 == r0) goto L91
            switch(r7) {
                case 2000: goto L8d;
                case 2001: goto L89;
                case 2002: goto L85;
                case 2003: goto L81;
                case 2004: goto L7d;
                case 2005: goto L79;
                case 2006: goto L75;
                case 2007: goto L71;
                default: goto L5d;
            }
        L5d:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Common cast status code"
            r1[r6] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r5] = r7
            java.lang.String r7 = java.lang.String.format(r0, r3, r1)
            goto L1db
        L71:
            java.lang.String r7 = "MESSAGE_SEND_BUFFER_TOO_FULL"
            goto L1db
        L75:
            java.lang.String r7 = "MESSAGE_TOO_LARGE"
            goto L1db
        L79:
            java.lang.String r7 = "APPLICATION_NOT_RUNNING"
            goto L1db
        L7d:
            java.lang.String r7 = "APPLICATION_NOT_FOUND"
            goto L1db
        L81:
            java.lang.String r7 = "NOT_ALLOWED"
            goto L1db
        L85:
            java.lang.String r7 = "CANCELED"
            goto L1db
        L89:
            java.lang.String r7 = "INVALID_REQUEST"
            goto L1db
        L8d:
            java.lang.String r7 = "AUTHENTICATION_FAILED"
            goto L1db
        L91:
            java.lang.String r7 = "TCP_PROBER_FAIL_TO_VERIFY_DEVICE"
            goto L1db
        L95:
            if (r7 < r0) goto Lb0
            r0 = 2109(0x83d, float:2.955E-42)
            if (r7 <= r0) goto L9c
            goto Lb0
        L9c:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Media control channel status code"
            r1[r6] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r5] = r7
            java.lang.String r7 = java.lang.String.format(r0, r3, r1)
            goto L1db
        Lb0:
            r0 = 2105(0x839, float:2.95E-42)
            if (r7 < r0) goto Lcd
            r0 = 2169(0x879, float:3.04E-42)
            if (r7 <= r0) goto Lb9
            goto Lcd
        Lb9:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Cast session status code"
            r1[r6] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r5] = r7
            java.lang.String r7 = java.lang.String.format(r0, r3, r1)
            goto L1db
        Lcd:
            if (r7 < r2) goto Le8
            r0 = 2219(0x8ab, float:3.11E-42)
            if (r7 <= r0) goto Ld4
            goto Le8
        Ld4:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Cast remote display status code"
            r1[r6] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r5] = r7
            java.lang.String r7 = java.lang.String.format(r0, r3, r1)
            goto L1db
        Le8:
            r0 = 2250(0x8ca, float:3.153E-42)
            if (r7 < r0) goto L105
            r0 = 2289(0x8f1, float:3.208E-42)
            if (r7 <= r0) goto Lf1
            goto L105
        Lf1:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Cast socket status code"
            r1[r6] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r5] = r7
            java.lang.String r7 = java.lang.String.format(r0, r3, r1)
            goto L1db
        L105:
            r0 = 2300(0x8fc, float:3.223E-42)
            if (r7 < r0) goto L122
            r0 = 2309(0x905, float:3.236E-42)
            if (r7 <= r0) goto L10e
            goto L122
        L10e:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Cast service status code"
            r1[r6] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r5] = r7
            java.lang.String r7 = java.lang.String.format(r0, r3, r1)
            goto L1db
        L122:
            r0 = 2310(0x906, float:3.237E-42)
            if (r7 < r0) goto L13f
            r0 = 2319(0x90f, float:3.25E-42)
            if (r7 <= r0) goto L12b
            goto L13f
        L12b:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Endpoint switch status code"
            r1[r6] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r5] = r7
            java.lang.String r7 = java.lang.String.format(r0, r3, r1)
            goto L1db
        L13f:
            r0 = 2350(0x92e, float:3.293E-42)
            if (r7 < r0) goto L15c
            r0 = 2359(0x937, float:3.306E-42)
            if (r7 <= r0) goto L148
            goto L15c
        L148:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Cast multizone device status code"
            r1[r6] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r5] = r7
            java.lang.String r7 = java.lang.String.format(r0, r3, r1)
            goto L1db
        L15c:
            r0 = 2400(0x960, float:3.363E-42)
            if (r7 < r0) goto L178
            r0 = 2419(0x973, float:3.39E-42)
            if (r7 <= r0) goto L165
            goto L178
        L165:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Cast relay casting status code"
            r1[r6] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r5] = r7
            java.lang.String r7 = java.lang.String.format(r0, r3, r1)
            goto L1db
        L178:
            r0 = 2450(0x992, float:3.433E-42)
            if (r7 < r0) goto L194
            r0 = 2469(0x9a5, float:3.46E-42)
            if (r7 <= r0) goto L181
            goto L194
        L181:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Cast nearby casting status code"
            r1[r6] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r5] = r7
            java.lang.String r7 = java.lang.String.format(r0, r3, r1)
            goto L1db
        L194:
            r0 = 2470(0x9a6, float:3.461E-42)
            if (r7 < r0) goto L1b0
            r0 = 2479(0x9af, float:3.474E-42)
            if (r7 <= r0) goto L19d
            goto L1b0
        L19d:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Cast application status code"
            r1[r6] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r5] = r7
            java.lang.String r7 = java.lang.String.format(r0, r3, r1)
            goto L1db
        L1b0:
            r0 = 2490(0x9ba, float:3.489E-42)
            if (r7 < r0) goto L1cb
            r0 = 2499(0x9c3, float:3.502E-42)
            if (r7 > r0) goto L1cb
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "Cast media loading status code"
            r1[r6] = r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r5] = r7
            java.lang.String r7 = java.lang.String.format(r0, r3, r1)
            goto L1db
        L1cb:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r6] = r7
            java.lang.String r7 = "Unknown cast status code %d"
            java.lang.String r7 = java.lang.String.format(r0, r7, r1)
        L1db:
            return r7
        L1dc:
            java.lang.String r7 = "A message could not be sent because there is not enough room in the send buffer at this time."
            return r7
        L1df:
            java.lang.String r7 = "A message could not be sent because it is too large."
            return r7
        L1e2:
            java.lang.String r7 = "A requested application is not currently running."
            return r7
        L1e5:
            java.lang.String r7 = "A requested application could not be found."
            return r7
        L1e8:
            java.lang.String r7 = "The request was disallowed and could not be completed."
            return r7
        L1eb:
            java.lang.String r7 = "An in-progress request has been canceled, most likely because another action has preempted it."
            return r7
        L1ee:
            java.lang.String r7 = "An invalid request was made."
            return r7
        L1f1:
            java.lang.String r7 = "Authentication failure."
            return r7
        L1f4:
            java.lang.String r7 = "An operation has timed out."
            return r7
        L1f7:
            java.lang.String r7 = "A blocking call was interrupted while waiting and did not run to completion."
            return r7
        L1fa:
            java.lang.String r7 = "An unknown, unexpected error has occurred."
            return r7
        L1fd:
            java.lang.String r7 = "The Cast Remote Display service was disconnected."
            return r7
        L200:
            java.lang.String r7 = "The Cast Remote Display service could not be created."
            return r7
        L203:
            java.lang.String r7 = "An internal error has occurred."
            return r7
        L206:
            java.lang.String r7 = "Network I/O error."
            return r7
        L209:
            java.lang.String r7 = "The request's progress is no longer being tracked because another request of the same type has been made before the first request completed."
            return r7
        L20c:
            java.lang.String r7 = "The in-progress request failed."
            return r7
        L20f:
            java.lang.String r7 = "Success."
            return r7
    }
}
