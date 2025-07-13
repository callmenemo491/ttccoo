package com.google.android.gms.cast.framework.media;

/* loaded from: classes.dex */
public class MediaNotificationService extends android.app.Service {

    /* renamed from: o0 */
    public static final p123h6.C2489b f5456o0 = null;

    /* renamed from: p0 */
    public static java.lang.Runnable f5457p0;

    /* renamed from: Y */
    public p071e6.C1529e f5458Y;

    /* renamed from: Z */
    public p071e6.C1525c f5459Z;

    /* renamed from: a0 */
    public android.content.ComponentName f5460a0;

    /* renamed from: b0 */
    public android.content.ComponentName f5461b0;

    /* renamed from: c0 */
    public java.util.List<p030c0.C0823j> f5462c0;

    /* renamed from: d0 */
    public int[] f5463d0;

    /* renamed from: e0 */
    public long f5464e0;

    /* renamed from: f0 */
    public p090f6.C2067b f5465f0;

    /* renamed from: g0 */
    public p071e6.C1523b f5466g0;

    /* renamed from: h0 */
    public android.content.res.Resources f5467h0;

    /* renamed from: i0 */
    public p071e6.C1522a0 f5468i0;

    /* renamed from: j0 */
    public androidx.appcompat.widget.C0311x f5469j0;

    /* renamed from: k0 */
    public android.app.NotificationManager f5470k0;

    /* renamed from: l0 */
    public android.app.Notification f5471l0;

    /* renamed from: m0 */
    public p052d6.C1295a f5472m0;

    /* renamed from: n0 */
    public final android.content.BroadcastReceiver f5473n0;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "MediaNotificationService"
            r0.<init>(r1)
            com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0 = r0
            return
    }

    public MediaNotificationService() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5462c0 = r0
            e6.z r0 = new e6.z
            r0.<init>(r1)
            r1.f5473n0 = r0
            return
    }

    /* renamed from: b */
    public static java.util.List<p071e6.C1527d> m2981b(p071e6.InterfaceC1547v r4) {
            java.util.List r4 = r4.mo4111h()     // Catch: android.os.RemoteException -> L5
            return r4
        L5:
            r4 = move-exception
            h6.b r0 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = "getNotificationActions"
            r1[r2] = r3
            r2 = 1
            java.lang.Class<e6.v> r3 = p071e6.InterfaceC1547v.class
            java.lang.String r3 = r3.getSimpleName()
            r1[r2] = r3
            java.lang.String r2 = r0.f11253a
            java.lang.String r3 = "Unable to call %s on %s."
            java.lang.String r0 = r0.m6380e(r3, r1)
            android.util.Log.e(r2, r0, r4)
            r4 = 0
            return r4
    }

    /* renamed from: d */
    public static int[] m2982d(p071e6.InterfaceC1547v r4) {
            int[] r4 = r4.mo4110e()     // Catch: android.os.RemoteException -> L5
            return r4
        L5:
            r4 = move-exception
            h6.b r0 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r3 = "getCompactViewActionIndices"
            r1[r2] = r3
            r2 = 1
            java.lang.Class<e6.v> r3 = p071e6.InterfaceC1547v.class
            java.lang.String r3 = r3.getSimpleName()
            r1[r2] = r3
            java.lang.String r2 = r0.f11253a
            java.lang.String r3 = "Unable to call %s on %s."
            java.lang.String r0 = r0.m6380e(r3, r1)
            android.util.Log.e(r2, r0, r4)
            r4 = 0
            return r4
    }

    /* renamed from: a */
    public final p030c0.C0823j m2983a(java.lang.String r33) {
            r32 = this;
            r0 = r32
            r1 = r33
            int r2 = r33.hashCode()
            r4 = 0
            r5 = 1
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.FORWARD"
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            java.lang.String r8 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            java.lang.String r9 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            java.lang.String r10 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            java.lang.String r11 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            java.lang.String r12 = "com.google.android.gms.cast.framework.action.REWIND"
            switch(r2) {
                case -1699820260: goto L4c;
                case -945151566: goto L44;
                case -945080078: goto L3c;
                case -668151673: goto L34;
                case -124479363: goto L2c;
                case 235550565: goto L24;
                case 1362116196: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L54
        L1c:
            boolean r2 = r1.equals(r6)
            if (r2 == 0) goto L54
            r2 = 3
            goto L55
        L24:
            boolean r2 = r1.equals(r7)
            if (r2 == 0) goto L54
            r2 = 0
            goto L55
        L2c:
            boolean r2 = r1.equals(r8)
            if (r2 == 0) goto L54
            r2 = 6
            goto L55
        L34:
            boolean r2 = r1.equals(r9)
            if (r2 == 0) goto L54
            r2 = 5
            goto L55
        L3c:
            boolean r2 = r1.equals(r10)
            if (r2 == 0) goto L54
            r2 = 2
            goto L55
        L44:
            boolean r2 = r1.equals(r11)
            if (r2 == 0) goto L54
            r2 = 1
            goto L55
        L4c:
            boolean r2 = r1.equals(r12)
            if (r2 == 0) goto L54
            r2 = 4
            goto L55
        L54:
            r2 = -1
        L55:
            r15 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r3 = "googlecast-extra_skip_step_ms"
            java.lang.String r13 = ""
            r14 = 0
            r19 = 30000(0x7530, double:1.4822E-319)
            switch(r2) {
                case 0: goto L365;
                case 1: goto L2ef;
                case 2: goto L279;
                case 3: goto L1e9;
                case 4: goto L159;
                case 5: goto Le3;
                case 6: goto L69;
                default: goto L61;
            }
        L61:
            h6.b r2 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r4] = r1
            goto L3f7
        L69:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r8)
            android.content.ComponentName r2 = r0.f5460a0
            r1.setComponent(r2)
            int r2 = p072e7.C1642j.f7655a
            android.app.PendingIntent r18 = android.app.PendingIntent.getBroadcast(r0, r4, r1, r2)
            e6.e r1 = r0.f5458Y
            int r2 = r1.f7430o0
            android.content.res.Resources r3 = r0.f5467h0
            int r1 = r1.f7412C0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r13
            java.lang.String r1 = r3.getString(r1, r5)
            if (r2 != 0) goto L8e
            r16 = r14
            goto L94
        L8e:
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.m1008b(r14, r13, r2)
            r16 = r2
        L94:
            android.os.Bundle r19 = new android.os.Bundle
            r19.<init>()
            r24 = 1
            java.lang.CharSequence r17 = p030c0.C0826m.m2482b(r1)
            r25 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto Lb4
            r21 = r14
            goto Lc2
        Lb4:
            int r3 = r1.size()
            c0.s[] r3 = new p030c0.C0832s[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            c0.s[] r1 = (p030c0.C0832s[]) r1
            r21 = r1
        Lc2:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Lc9
            goto Ld6
        Lc9:
            int r1 = r2.size()
            c0.s[] r1 = new p030c0.C0832s[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            r14 = r1
            c0.s[] r14 = (p030c0.C0832s[]) r14
        Ld6:
            r20 = r14
            c0.j r1 = new c0.j
            r15 = r1
            r22 = r24
            r23 = r25
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        Le3:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r9)
            android.content.ComponentName r2 = r0.f5460a0
            r1.setComponent(r2)
            int r2 = p072e7.C1642j.f7655a
            android.app.PendingIntent r18 = android.app.PendingIntent.getBroadcast(r0, r4, r1, r2)
            e6.e r1 = r0.f5458Y
            int r2 = r1.f7430o0
            android.content.res.Resources r3 = r0.f5467h0
            int r1 = r1.f7412C0
            java.lang.String r1 = r3.getString(r1)
            if (r2 != 0) goto L104
            r16 = r14
            goto L10a
        L104:
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.m1008b(r14, r13, r2)
            r16 = r2
        L10a:
            android.os.Bundle r19 = new android.os.Bundle
            r19.<init>()
            r24 = 1
            java.lang.CharSequence r17 = p030c0.C0826m.m2482b(r1)
            r25 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L12a
            r21 = r14
            goto L138
        L12a:
            int r3 = r1.size()
            c0.s[] r3 = new p030c0.C0832s[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            c0.s[] r1 = (p030c0.C0832s[]) r1
            r21 = r1
        L138:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L13f
            goto L14c
        L13f:
            int r1 = r2.size()
            c0.s[] r1 = new p030c0.C0832s[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            r14 = r1
            c0.s[] r14 = (p030c0.C0832s[]) r14
        L14c:
            r20 = r14
            c0.j r1 = new c0.j
            r15 = r1
            r22 = r24
            r23 = r25
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        L159:
            long r1 = r0.f5464e0
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r12)
            android.content.ComponentName r6 = r0.f5460a0
            r5.setComponent(r6)
            r5.putExtra(r3, r1)
            int r3 = p072e7.C1642j.f7655a
            r3 = r3 | r15
            android.app.PendingIntent r24 = android.app.PendingIntent.getBroadcast(r0, r4, r5, r3)
            e6.e r3 = r0.f5458Y
            int r4 = r3.f7427l0
            int r5 = r3.f7441z0
            r6 = 10000(0x2710, double:4.9407E-320)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L180
            int r4 = r3.f7428m0
            int r5 = r3.f7410A0
            goto L188
        L180:
            int r6 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r6 != 0) goto L188
            int r4 = r3.f7429n0
            int r5 = r3.f7411B0
        L188:
            android.content.res.Resources r1 = r0.f5467h0
            java.lang.String r1 = r1.getString(r5)
            if (r4 != 0) goto L193
            r22 = r14
            goto L199
        L193:
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.m1008b(r14, r13, r4)
            r22 = r2
        L199:
            android.os.Bundle r25 = new android.os.Bundle
            r25.<init>()
            r30 = 1
            java.lang.CharSequence r23 = p030c0.C0826m.m2482b(r1)
            r31 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L1b9
            r27 = r14
            goto L1c7
        L1b9:
            int r3 = r1.size()
            c0.s[] r3 = new p030c0.C0832s[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            c0.s[] r1 = (p030c0.C0832s[]) r1
            r27 = r1
        L1c7:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L1ce
            goto L1db
        L1ce:
            int r1 = r2.size()
            c0.s[] r1 = new p030c0.C0832s[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            r14 = r1
            c0.s[] r14 = (p030c0.C0832s[]) r14
        L1db:
            r26 = r14
            c0.j r1 = new c0.j
            r21 = r1
            r28 = r30
            r29 = r31
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r1
        L1e9:
            long r1 = r0.f5464e0
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r6)
            android.content.ComponentName r6 = r0.f5460a0
            r5.setComponent(r6)
            r5.putExtra(r3, r1)
            int r3 = p072e7.C1642j.f7655a
            r3 = r3 | r15
            android.app.PendingIntent r24 = android.app.PendingIntent.getBroadcast(r0, r4, r5, r3)
            e6.e r3 = r0.f5458Y
            int r4 = r3.f7424i0
            int r5 = r3.f7438w0
            r6 = 10000(0x2710, double:4.9407E-320)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L210
            int r4 = r3.f7425j0
            int r5 = r3.f7439x0
            goto L218
        L210:
            int r6 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r6 != 0) goto L218
            int r4 = r3.f7426k0
            int r5 = r3.f7440y0
        L218:
            android.content.res.Resources r1 = r0.f5467h0
            java.lang.String r1 = r1.getString(r5)
            if (r4 != 0) goto L223
            r22 = r14
            goto L229
        L223:
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.m1008b(r14, r13, r4)
            r22 = r2
        L229:
            android.os.Bundle r25 = new android.os.Bundle
            r25.<init>()
            r30 = 1
            java.lang.CharSequence r23 = p030c0.C0826m.m2482b(r1)
            r31 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L249
            r27 = r14
            goto L257
        L249:
            int r3 = r1.size()
            c0.s[] r3 = new p030c0.C0832s[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            c0.s[] r1 = (p030c0.C0832s[]) r1
            r27 = r1
        L257:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L25e
            goto L26b
        L25e:
            int r1 = r2.size()
            c0.s[] r1 = new p030c0.C0832s[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            r14 = r1
            c0.s[] r14 = (p030c0.C0832s[]) r14
        L26b:
            r26 = r14
            c0.j r1 = new c0.j
            r21 = r1
            r28 = r30
            r29 = r31
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r1
        L279:
            e6.a0 r1 = r0.f5468i0
            boolean r1 = r1.f7396g
            if (r1 == 0) goto L291
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r10)
            android.content.ComponentName r2 = r0.f5460a0
            r1.setComponent(r2)
            int r2 = p072e7.C1642j.f7655a
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r0, r4, r1, r2)
            r5 = r1
            goto L292
        L291:
            r5 = r14
        L292:
            e6.e r1 = r0.f5458Y
            int r2 = r1.f7423h0
            android.content.res.Resources r3 = r0.f5467h0
            int r1 = r1.f7437v0
            java.lang.String r1 = r3.getString(r1)
            if (r2 != 0) goto L2a2
            r3 = r14
            goto L2a7
        L2a2:
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.m1008b(r14, r13, r2)
            r3 = r2
        L2a7:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r11 = 1
            java.lang.CharSequence r4 = p030c0.C0826m.m2482b(r1)
            r12 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L2c4
            r8 = r14
            goto L2d1
        L2c4:
            int r7 = r1.size()
            c0.s[] r7 = new p030c0.C0832s[r7]
            java.lang.Object[] r1 = r1.toArray(r7)
            c0.s[] r1 = (p030c0.C0832s[]) r1
            r8 = r1
        L2d1:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L2d8
            goto L2e5
        L2d8:
            int r1 = r2.size()
            c0.s[] r1 = new p030c0.C0832s[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            r14 = r1
            c0.s[] r14 = (p030c0.C0832s[]) r14
        L2e5:
            r7 = r14
            c0.j r1 = new c0.j
            r2 = r1
            r9 = r11
            r10 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L2ef:
            e6.a0 r1 = r0.f5468i0
            boolean r1 = r1.f7395f
            if (r1 == 0) goto L307
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r11)
            android.content.ComponentName r2 = r0.f5460a0
            r1.setComponent(r2)
            int r2 = p072e7.C1642j.f7655a
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r0, r4, r1, r2)
            r5 = r1
            goto L308
        L307:
            r5 = r14
        L308:
            e6.e r1 = r0.f5458Y
            int r2 = r1.f7422g0
            android.content.res.Resources r3 = r0.f5467h0
            int r1 = r1.f7436u0
            java.lang.String r1 = r3.getString(r1)
            if (r2 != 0) goto L318
            r3 = r14
            goto L31d
        L318:
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.m1008b(r14, r13, r2)
            r3 = r2
        L31d:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r11 = 1
            java.lang.CharSequence r4 = p030c0.C0826m.m2482b(r1)
            r12 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L33a
            r8 = r14
            goto L347
        L33a:
            int r7 = r1.size()
            c0.s[] r7 = new p030c0.C0832s[r7]
            java.lang.Object[] r1 = r1.toArray(r7)
            c0.s[] r1 = (p030c0.C0832s[]) r1
            r8 = r1
        L347:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L34e
            goto L35b
        L34e:
            int r1 = r2.size()
            c0.s[] r1 = new p030c0.C0832s[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            r14 = r1
            c0.s[] r14 = (p030c0.C0832s[]) r14
        L35b:
            r7 = r14
            c0.j r1 = new c0.j
            r2 = r1
            r9 = r11
            r10 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L365:
            e6.a0 r1 = r0.f5468i0
            int r2 = r1.f7392c
            boolean r1 = r1.f7391b
            r3 = 2
            if (r2 != r3) goto L375
            e6.e r2 = r0.f5458Y
            int r3 = r2.f7419d0
            int r2 = r2.f7433r0
            goto L37b
        L375:
            e6.e r2 = r0.f5458Y
            int r3 = r2.f7420e0
            int r2 = r2.f7434s0
        L37b:
            if (r1 != 0) goto L381
            e6.e r3 = r0.f5458Y
            int r3 = r3.f7421f0
        L381:
            if (r1 != 0) goto L387
            e6.e r1 = r0.f5458Y
            int r2 = r1.f7435t0
        L387:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r7)
            android.content.ComponentName r5 = r0.f5460a0
            r1.setComponent(r5)
            int r5 = p072e7.C1642j.f7655a
            android.app.PendingIntent r18 = android.app.PendingIntent.getBroadcast(r0, r4, r1, r5)
            android.content.res.Resources r1 = r0.f5467h0
            java.lang.String r1 = r1.getString(r2)
            if (r3 != 0) goto L3a2
            r16 = r14
            goto L3a8
        L3a2:
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.m1008b(r14, r13, r3)
            r16 = r2
        L3a8:
            android.os.Bundle r19 = new android.os.Bundle
            r19.<init>()
            r24 = 1
            java.lang.CharSequence r17 = p030c0.C0826m.m2482b(r1)
            r25 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L3c8
            r21 = r14
            goto L3d6
        L3c8:
            int r3 = r1.size()
            c0.s[] r3 = new p030c0.C0832s[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            c0.s[] r1 = (p030c0.C0832s[]) r1
            r21 = r1
        L3d6:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L3dd
            goto L3ea
        L3dd:
            int r1 = r2.size()
            c0.s[] r1 = new p030c0.C0832s[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            r14 = r1
            c0.s[] r14 = (p030c0.C0832s[]) r14
        L3ea:
            r20 = r14
            c0.j r1 = new c0.j
            r15 = r1
            r22 = r24
            r23 = r25
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        L3f7:
            java.lang.String r1 = r2.f11253a
            java.lang.String r4 = "Action: %s is not a pre-defined action."
            java.lang.String r2 = r2.m6380e(r4, r3)
            android.util.Log.e(r1, r2)
            return r14
    }

    /* renamed from: c */
    public final void m2984c() {
            r20 = this;
            r0 = r20
            e6.a0 r1 = r0.f5468i0
            if (r1 != 0) goto L7
            return
        L7:
            androidx.appcompat.widget.x r1 = r0.f5469j0
            r2 = 0
            if (r1 != 0) goto Le
            r1 = r2
            goto L12
        Le:
            java.lang.Object r1 = r1.f1482a0
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
        L12:
            c0.m r3 = new c0.m
            java.lang.String r4 = "cast_media_notification"
            r3.<init>(r0, r4)
            r3.m2487f(r1)
            e6.e r1 = r0.f5458Y
            int r1 = r1.f7418c0
            android.app.Notification r4 = r3.f4485y
            r4.icon = r1
            e6.a0 r1 = r0.f5468i0
            java.lang.String r1 = r1.f7393d
            r3.m2485d(r1)
            android.content.res.Resources r1 = r0.f5467h0
            e6.e r4 = r0.f5458Y
            int r4 = r4.f7432q0
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            e6.a0 r7 = r0.f5468i0
            java.lang.String r7 = r7.f7394e
            r8 = 0
            r6[r8] = r7
            java.lang.String r1 = r1.getString(r4, r6)
            r3.m2484c(r1)
            r1 = 2
            r3.m2486e(r1, r5)
            r3.f4471k = r8
            r3.f4481u = r5
            android.content.ComponentName r1 = r0.f5461b0
            if (r1 != 0) goto L50
            r1 = r2
            goto L6a
        L50:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r6 = "targetActivity"
            r4.putExtra(r6, r1)
            java.lang.String r1 = r1.flattenToString()
            r4.setAction(r1)
            int r1 = p072e7.C1642j.f7655a
            r6 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 | r6
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r0, r5, r4, r1)
        L6a:
            if (r1 == 0) goto L6e
            r3.f4467g = r1
        L6e:
            e6.e r1 = r0.f5458Y
            e6.v r1 = r1.f7413D0
            if (r1 == 0) goto L16a
            h6.b r4 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.String r7 = r4.f11253a
            java.lang.String r9 = "actionsProvider != null"
            java.lang.String r4 = r4.m6380e(r9, r6)
            android.util.Log.i(r7, r4)
            int[] r4 = m2982d(r1)
            if (r4 != 0) goto L8b
            r4 = r2
            goto L91
        L8b:
            java.lang.Object r4 = r4.clone()
            int[] r4 = (int[]) r4
        L91:
            r0.f5463d0 = r4
            java.util.List r1 = m2981b(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f5462c0 = r4
            if (r1 != 0) goto La2
            goto L1b1
        La2:
            java.util.Iterator r1 = r1.iterator()
        La6:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1b1
            java.lang.Object r4 = r1.next()
            e6.d r4 = (p071e6.C1527d) r4
            java.lang.String r6 = r4.f7404Y
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L15b
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L15b
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L15b
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.FORWARD"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L15b
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.REWIND"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L15b
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L15b
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lee
            goto L15b
        Lee:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r7 = r4.f7404Y
            r6.<init>(r7)
            android.content.ComponentName r7 = r0.f5460a0
            r6.setComponent(r7)
            int r7 = p072e7.C1642j.f7655a
            android.app.PendingIntent r12 = android.app.PendingIntent.getBroadcast(r0, r8, r6, r7)
            int r6 = r4.f7405Z
            java.lang.String r4 = r4.f7406a0
            if (r6 != 0) goto L108
            r10 = r2
            goto L10f
        L108:
            java.lang.String r7 = ""
            androidx.core.graphics.drawable.IconCompat r6 = androidx.core.graphics.drawable.IconCompat.m1008b(r2, r7, r6)
            r10 = r6
        L10f:
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            r18 = 1
            java.lang.CharSequence r11 = p030c0.C0826m.m2482b(r4)
            r19 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L12e
            r15 = r2
            goto L13b
        L12e:
            int r7 = r4.size()
            c0.s[] r7 = new p030c0.C0832s[r7]
            java.lang.Object[] r4 = r4.toArray(r7)
            c0.s[] r4 = (p030c0.C0832s[]) r4
            r15 = r4
        L13b:
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L143
            r14 = r2
            goto L150
        L143:
            int r4 = r6.size()
            c0.s[] r4 = new p030c0.C0832s[r4]
            java.lang.Object[] r4 = r6.toArray(r4)
            c0.s[] r4 = (p030c0.C0832s[]) r4
            r14 = r4
        L150:
            c0.j r4 = new c0.j
            r9 = r4
            r16 = r18
            r17 = r19
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L161
        L15b:
            java.lang.String r4 = r4.f7404Y
            c0.j r4 = r0.m2983a(r4)
        L161:
            if (r4 == 0) goto La6
            java.util.List<c0.j> r6 = r0.f5462c0
            r6.add(r4)
            goto La6
        L16a:
            h6.b r1 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r4 = r1.f11253a
            java.lang.String r6 = "actionsProvider == null"
            java.lang.String r1 = r1.m6380e(r6, r2)
            android.util.Log.i(r4, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f5462c0 = r1
            e6.e r1 = r0.f5458Y
            java.util.List<java.lang.String> r1 = r1.f7414Y
            java.util.Iterator r1 = r1.iterator()
        L188:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a0
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            c0.j r2 = r0.m2983a(r2)
            if (r2 == 0) goto L188
            java.util.List<c0.j> r4 = r0.f5462c0
            r4.add(r2)
            goto L188
        L1a0:
            e6.e r1 = r0.f5458Y
            int[] r1 = r1.f7415Z
            int r2 = r1.length
            int[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            r0.f5463d0 = r1
        L1b1:
            java.util.List<c0.j> r1 = r0.f5462c0
            java.util.Iterator r1 = r1.iterator()
        L1b7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1cb
            java.lang.Object r2 = r1.next()
            c0.j r2 = (p030c0.C0823j) r2
            if (r2 == 0) goto L1b7
            java.util.ArrayList<c0.j> r4 = r3.f4462b
            r4.add(r2)
            goto L1b7
        L1cb:
            d1.b r1 = new d1.b
            r1.<init>()
            int[] r2 = r0.f5463d0
            if (r2 == 0) goto L1d6
            r1.f6735b = r2
        L1d6:
            e6.a0 r2 = r0.f5468i0
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.f7390a
            if (r2 == 0) goto L1de
            r1.f6736c = r2
        L1de:
            c0.n r2 = r3.f4473m
            if (r2 == r1) goto L1e7
            r3.f4473m = r1
            r1.m2491f(r3)
        L1e7:
            android.app.Notification r1 = r3.m2483a()
            r0.f5471l0 = r1
            r0.startForeground(r5, r1)
            return
    }

    @Override // android.app.Service
    @androidx.annotation.RecentlyNullable
    public android.os.IBinder onBind(@androidx.annotation.RecentlyNonNull android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r4 = this;
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r4.f5470k0 = r0
            d6.a r0 = p052d6.C1295a.m3761b(r4)
            r4.f5472m0 = r0
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r1)
            d6.b r0 = r0.f6812e
            e6.a r0 = r0.f6822d0
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            e6.e r2 = r0.f7387b0
            java.util.Objects.requireNonNull(r2, r1)
            r4.f5458Y = r2
            e6.c r1 = r0.m4105X()
            r4.f5459Z = r1
            android.content.res.Resources r1 = r4.getResources()
            r4.f5467h0 = r1
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r2 = r4.getApplicationContext()
            java.lang.String r0 = r0.f7384Y
            r1.<init>(r2, r0)
            r4.f5460a0 = r1
            e6.e r0 = r4.f5458Y
            java.lang.String r0 = r0.f7417b0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L59
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r4.getApplicationContext()
            e6.e r2 = r4.f5458Y
            java.lang.String r2 = r2.f7417b0
            r0.<init>(r1, r2)
            goto L5a
        L59:
            r0 = 0
        L5a:
            r4.f5461b0 = r0
            e6.e r0 = r4.f5458Y
            long r1 = r0.f7416a0
            r4.f5464e0 = r1
            android.content.res.Resources r1 = r4.f5467h0
            int r0 = r0.f7431p0
            int r0 = r1.getDimensionPixelSize(r0)
            e6.b r1 = new e6.b
            r2 = 1
            r1.<init>(r2, r0, r0)
            r4.f5466g0 = r1
            f6.b r0 = new f6.b
            android.content.Context r1 = r4.getApplicationContext()
            e6.b r2 = r4.f5466g0
            r0.<init>(r1, r2)
            r4.f5465f0 = r0
            android.content.ComponentName r0 = r4.f5461b0
            if (r0 == 0) goto L91
            android.content.BroadcastReceiver r1 = r4.f5473n0
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r0 = r0.flattenToString()
            r2.<init>(r0)
            r4.registerReceiver(r1, r2)
        L91:
            boolean r0 = p353u6.C6345h.m12995a()
            if (r0 != 0) goto L98
            return
        L98:
            android.app.NotificationChannel r0 = new android.app.NotificationChannel
            r1 = 2
            java.lang.String r2 = "cast_media_notification"
            java.lang.String r3 = "Cast"
            r0.<init>(r2, r3, r1)
            r1 = 0
            r0.setShowBadge(r1)
            android.app.NotificationManager r1 = r4.f5470k0
            r1.createNotificationChannel(r0)
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r5 = this;
            f6.b r0 = r5.f5465f0
            if (r0 == 0) goto L7
            r0.m5489a()
        L7:
            android.content.ComponentName r0 = r5.f5461b0
            if (r0 == 0) goto L22
            android.content.BroadcastReceiver r0 = r5.f5473n0     // Catch: java.lang.IllegalArgumentException -> L11
            r5.unregisterReceiver(r0)     // Catch: java.lang.IllegalArgumentException -> L11
            goto L22
        L11:
            r0 = move-exception
            h6.b r1 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r1.f11253a
            java.lang.String r4 = "Unregistering trampoline BroadcastReceiver failed"
            java.lang.String r1 = r1.m6380e(r4, r2)
            android.util.Log.e(r3, r1, r0)
        L22:
            r0 = 0
            com.google.android.gms.cast.framework.media.MediaNotificationService.f5457p0 = r0
            android.app.NotificationManager r0 = r5.f5470k0
            r1 = 1
            r0.cancel(r1)
            return
    }

    @Override // android.app.Service
    public int onStartCommand(@androidx.annotation.RecentlyNonNull android.content.Intent r19, int r20, int r21) {
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "extra_media_info"
            android.os.Parcelable r2 = r1.getParcelableExtra(r2)
            com.google.android.gms.cast.MediaInfo r2 = (com.google.android.gms.cast.MediaInfo) r2
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)
            c6.k r4 = r2.f5376b0
            java.util.Objects.requireNonNull(r4, r3)
            java.lang.String r5 = "extra_remote_media_client_player_state"
            r6 = 0
            int r5 = r1.getIntExtra(r5, r6)
            java.lang.String r7 = "extra_cast_device"
            android.os.Parcelable r7 = r1.getParcelableExtra(r7)
            com.google.android.gms.cast.CastDevice r7 = (com.google.android.gms.cast.CastDevice) r7
            java.util.Objects.requireNonNull(r7, r3)
            r8 = 2
            if (r5 != r8) goto L2d
            r5 = 1
            goto L2e
        L2d:
            r5 = 0
        L2e:
            e6.a0 r15 = new e6.a0
            int r2 = r2.f5374Z
            java.lang.String r9 = "com.google.android.gms.cast.metadata.TITLE"
            java.lang.String r14 = r4.m2599X(r9)
            java.lang.String r7 = r7.f5353b0
            java.lang.String r9 = "extra_media_session_token"
            android.os.Parcelable r9 = r1.getParcelableExtra(r9)
            r16 = r9
            android.support.v4.media.session.MediaSessionCompat$Token r16 = (android.support.v4.media.session.MediaSessionCompat.Token) r16
            java.lang.String r9 = "extra_can_skip_next"
            boolean r13 = r1.getBooleanExtra(r9, r6)
            java.lang.String r9 = "extra_can_skip_prev"
            boolean r12 = r1.getBooleanExtra(r9, r6)
            r9 = r15
            r10 = r5
            r11 = r2
            r20 = r12
            r12 = r14
            r17 = r13
            r13 = r7
            r8 = r14
            r14 = r16
            r3 = r15
            r15 = r17
            r16 = r20
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r9 = "extra_media_notification_force_update"
            boolean r1 = r1.getBooleanExtra(r9, r6)
            if (r1 != 0) goto L94
            e6.a0 r1 = r0.f5468i0
            if (r1 == 0) goto L94
            boolean r9 = r1.f7391b
            if (r5 != r9) goto L94
            int r5 = r1.f7392c
            if (r2 != r5) goto L94
            java.lang.String r2 = r1.f7393d
            boolean r2 = p123h6.C2487a.m6368g(r8, r2)
            if (r2 == 0) goto L94
            java.lang.String r2 = r1.f7394e
            boolean r2 = p123h6.C2487a.m6368g(r7, r2)
            if (r2 == 0) goto L94
            boolean r2 = r1.f7395f
            r5 = r17
            if (r5 != r2) goto L94
            boolean r1 = r1.f7396g
            r2 = r20
            if (r2 == r1) goto L99
        L94:
            r0.f5468i0 = r3
            r18.m2984c()
        L99:
            androidx.appcompat.widget.x r1 = new androidx.appcompat.widget.x
            e6.c r2 = r0.f5459Z
            if (r2 == 0) goto La9
            e6.b r3 = r0.f5466g0
            java.util.Objects.requireNonNull(r3)
            n6.a r2 = r2.m4106a(r4)
            goto Lb9
        La9:
            boolean r2 = r4.m2600Y()
            if (r2 == 0) goto Lb8
            java.util.List<n6.a> r2 = r4.f4793Y
            java.lang.Object r2 = r2.get(r6)
            n6.a r2 = (p233n6.C4691a) r2
            goto Lb9
        Lb8:
            r2 = 0
        Lb9:
            r1.<init>(r2)
            androidx.appcompat.widget.x r2 = r0.f5469j0
            if (r2 == 0) goto Lce
            java.lang.Object r3 = r1.f1481Z
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r2 = r2.f1481Z
            android.net.Uri r2 = (android.net.Uri) r2
            boolean r2 = p123h6.C2487a.m6368g(r3, r2)
            if (r2 != 0) goto Lde
        Lce:
            f6.b r2 = r0.f5465f0
            androidx.appcompat.widget.x r3 = new androidx.appcompat.widget.x
            r3.<init>(r0, r1)
            r2.f9471f = r3
            java.lang.Object r1 = r1.f1481Z
            android.net.Uri r1 = (android.net.Uri) r1
            r2.m5490b(r1)
        Lde:
            android.app.Notification r1 = r0.f5471l0
            r2 = 1
            r0.startForeground(r2, r1)
            e6.y r1 = new e6.y
            r2 = r21
            r1.<init>(r0, r2)
            com.google.android.gms.cast.framework.media.MediaNotificationService.f5457p0 = r1
            r1 = 2
            return r1
    }
}
