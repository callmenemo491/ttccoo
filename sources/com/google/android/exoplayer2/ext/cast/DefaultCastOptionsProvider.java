package com.google.android.exoplayer2.ext.cast;

/* loaded from: classes.dex */
public final class DefaultCastOptionsProvider implements p052d6.InterfaceC1299c {
    public DefaultCastOptionsProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p052d6.InterfaceC1299c
    public java.util.List<p052d6.AbstractC1309h> getAdditionalSessionProviders(android.content.Context r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
    }

    @Override // p052d6.InterfaceC1299c
    public p052d6.C1297b getCastOptions(android.content.Context r45) {
            r44 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            c6.h r4 = new c6.h
            r4.<init>()
            r8 = 4587366580546961408(0x3fa99999a0000000, double:0.05000000074505806)
            r5 = 0
            r7 = 0
            r3 = 1
            java.util.List<java.lang.String> r11 = p071e6.C1529e.f7408E0
            int[] r12 = p071e6.C1529e.f7409F0
            java.lang.String r0 = "smallIconDrawableResId"
            int r16 = p071e6.C1529e.a.m4107a(r0)
            java.lang.String r0 = "stopLiveStreamDrawableResId"
            int r17 = p071e6.C1529e.a.m4107a(r0)
            java.lang.String r0 = "pauseDrawableResId"
            int r18 = p071e6.C1529e.a.m4107a(r0)
            java.lang.String r0 = "playDrawableResId"
            int r19 = p071e6.C1529e.a.m4107a(r0)
            java.lang.String r0 = "skipNextDrawableResId"
            int r20 = p071e6.C1529e.a.m4107a(r0)
            java.lang.String r0 = "skipPrevDrawableResId"
            int r21 = p071e6.C1529e.a.m4107a(r0)
            java.lang.String r0 = "forwardDrawableResId"
            int r22 = p071e6.C1529e.a.m4107a(r0)
            java.lang.String r0 = "forward10DrawableResId"
            int r23 = p071e6.C1529e.a.m4107a(r0)
            java.lang.String r0 = "forward30DrawableResId"
            int r24 = p071e6.C1529e.a.m4107a(r0)
            java.lang.String r0 = "rewindDrawableResId"
            int r25 = p071e6.C1529e.a.m4107a(r0)
            java.lang.String r0 = "rewind10DrawableResId"
            int r26 = p071e6.C1529e.a.m4107a(r0)
            java.lang.String r0 = "rewind30DrawableResId"
            int r27 = p071e6.C1529e.a.m4107a(r0)
            java.lang.String r0 = "disconnectDrawableResId"
            int r28 = p071e6.C1529e.a.m4107a(r0)
            r13 = 10000(0x2710, double:4.9407E-320)
            r43 = 0
            e6.e r0 = new e6.e
            r10 = r0
            java.lang.String r1 = "notificationImageSizeDimenResId"
            int r29 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "castingToDeviceStringResId"
            int r30 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "stopLiveStreamStringResId"
            int r31 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "pauseStringResId"
            int r32 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "playStringResId"
            int r33 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "skipNextStringResId"
            int r34 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "skipPrevStringResId"
            int r35 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "forwardStringResId"
            int r36 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "forward10StringResId"
            int r37 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "forward30StringResId"
            int r38 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "rewindStringResId"
            int r39 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "rewind10StringResId"
            int r40 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "rewind30StringResId"
            int r41 = p071e6.C1529e.a.m4107a(r1)
            java.lang.String r1 = "disconnectStringResId"
            int r42 = p071e6.C1529e.a.m4107a(r1)
            r15 = 0
            r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r35 = 1
            r32 = 0
            e6.a r6 = new e6.a
            r31 = 0
            r34 = 0
            java.lang.String r30 = "com.google.android.gms.cast.framework.media.MediaIntentReceiver"
            r29 = r6
            r33 = r0
            r29.<init>(r30, r31, r32, r33, r34, r35)
            d6.b r13 = new d6.b
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r1 = "A12D4273"
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            return r13
    }
}
