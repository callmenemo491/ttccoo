package p284q4;

/* renamed from: q4.e */
/* loaded from: classes.dex */
public final class C5575e {

    /* renamed from: a */
    public static final java.lang.String[] f21716a = null;

    /* renamed from: b */
    public static final java.lang.String[] f21717b = null;

    /* renamed from: c */
    public static final java.lang.String[] f21718c = null;

    static {
            java.lang.String r0 = "Camera:MotionPhoto"
            java.lang.String r1 = "GCamera:MotionPhoto"
            java.lang.String r2 = "Camera:MicroVideo"
            java.lang.String r3 = "GCamera:MicroVideo"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            p284q4.C5575e.f21716a = r0
            java.lang.String r0 = "Camera:MotionPhotoPresentationTimestampUs"
            java.lang.String r1 = "GCamera:MotionPhotoPresentationTimestampUs"
            java.lang.String r2 = "Camera:MicroVideoPresentationTimestampUs"
            java.lang.String r3 = "GCamera:MicroVideoPresentationTimestampUs"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            p284q4.C5575e.f21717b = r0
            java.lang.String r0 = "Camera:MicroVideoOffset"
            java.lang.String r1 = "GCamera:MicroVideoOffset"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            p284q4.C5575e.f21718c = r0
            return
    }

    /* renamed from: a */
    public static p284q4.C5572b m11864a(java.lang.String r25) {
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r25
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = p064e.C1494h.m4061l(r0, r1)
            r3 = 0
            if (r2 == 0) goto Le5
            b9.a<java.lang.Object> r2 = p026b9.AbstractC0714n.f3979Z
            b9.n<java.lang.Object> r2 = p026b9.C0693c0.f3898c0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = p064e.C1494h.m4061l(r0, r8)
            if (r8 == 0) goto Lb4
            java.lang.String[] r2 = p284q4.C5575e.f21716a
            int r6 = r2.length
            r7 = 0
            r8 = 0
        L38:
            r9 = 1
            if (r8 >= r6) goto L4b
            r10 = r2[r8]
            java.lang.String r10 = p064e.C1494h.m4056g(r0, r10)
            if (r10 == 0) goto L4d
            int r2 = java.lang.Integer.parseInt(r10)
            if (r2 != r9) goto L4b
            r2 = 1
            goto L50
        L4b:
            r2 = 0
            goto L50
        L4d:
            int r8 = r8 + 1
            goto L38
        L50:
            if (r2 != 0) goto L53
            return r3
        L53:
            java.lang.String[] r2 = p284q4.C5575e.f21717b
            int r6 = r2.length
            r8 = 0
        L57:
            if (r8 >= r6) goto L6b
            r10 = r2[r8]
            java.lang.String r10 = p064e.C1494h.m4056g(r0, r10)
            if (r10 == 0) goto L6d
            long r10 = java.lang.Long.parseLong(r10)
            r12 = -1
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L70
        L6b:
            r10 = r4
            goto L70
        L6d:
            int r8 = r8 + 1
            goto L57
        L70:
            java.lang.String[] r2 = p284q4.C5575e.f21718c
            int r6 = r2.length
            r8 = 0
        L74:
            if (r8 >= r6) goto Lae
            r12 = r2[r8]
            java.lang.String r12 = p064e.C1494h.m4056g(r0, r12)
            if (r12 == 0) goto Lab
            long r16 = java.lang.Long.parseLong(r12)
            q4.b$a r2 = new q4.b$a
            r21 = 0
            r23 = 0
            java.lang.String r19 = "image/jpeg"
            java.lang.String r20 = "Primary"
            r18 = r2
            r18.<init>(r19, r20, r21, r23)
            q4.b$a r6 = new q4.b$a
            r18 = 0
            java.lang.String r14 = "video/mp4"
            java.lang.String r15 = "MotionPhoto"
            r13 = r6
            r13.<init>(r14, r15, r16, r18)
            b9.a<java.lang.Object> r8 = p026b9.AbstractC0714n.f3979Z
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r7] = r2
            r8[r9] = r6
            b9.n r2 = p026b9.AbstractC0714n.m2310u(r8)
            goto Lb2
        Lab:
            int r8 = r8 + 1
            goto L74
        Lae:
            b9.a<java.lang.Object> r2 = p026b9.AbstractC0714n.f3979Z
            b9.n<java.lang.Object> r2 = p026b9.C0693c0.f3898c0
        Lb2:
            r6 = r10
            goto Ld2
        Lb4:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = p064e.C1494h.m4061l(r0, r8)
            if (r8 == 0) goto Lc5
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
        Lc0:
            b9.n r2 = m11865b(r0, r2, r8)
            goto Ld2
        Lc5:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = p064e.C1494h.m4061l(r0, r8)
            if (r8 == 0) goto Ld2
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            goto Lc0
        Ld2:
            boolean r8 = p064e.C1494h.m4060k(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ldf
            return r3
        Ldf:
            q4.b r0 = new q4.b
            r0.<init>(r6, r2)
            return r0
        Le5:
            java.lang.String r0 = "Couldn't find xmp metadata"
            f4.s0 r0 = p088f4.C2044s0.m5407a(r0, r3)
            throw r0
    }

    /* renamed from: b */
    public static p026b9.AbstractC0714n<p284q4.C5572b.a> m11865b(org.xmlpull.v1.XmlPullParser r17, java.lang.String r18, java.lang.String r19) {
            r0 = r17
            r1 = r18
            r2 = r19
            b9.a<java.lang.Object> r3 = p026b9.AbstractC0714n.f3979Z
            r3 = 4
            java.lang.String r4 = "initialCapacity"
            p026b9.C0720t.m2328b(r3, r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = ":Item"
            java.lang.String r4 = r1.concat(r4)
            java.lang.String r5 = ":Directory"
            java.lang.String r1 = r1.concat(r5)
            r5 = 0
        L1d:
            r17.next()
            boolean r6 = p064e.C1494h.m4061l(r0, r4)
            if (r6 == 0) goto L81
            java.lang.String r6 = ":Mime"
            java.lang.String r6 = r2.concat(r6)
            java.lang.String r7 = ":Semantic"
            java.lang.String r7 = r2.concat(r7)
            java.lang.String r8 = ":Length"
            java.lang.String r8 = r2.concat(r8)
            java.lang.String r9 = ":Padding"
            java.lang.String r9 = r2.concat(r9)
            java.lang.String r11 = p064e.C1494h.m4056g(r0, r6)
            java.lang.String r12 = p064e.C1494h.m4056g(r0, r7)
            java.lang.String r6 = p064e.C1494h.m4056g(r0, r8)
            java.lang.String r7 = p064e.C1494h.m4056g(r0, r9)
            if (r11 == 0) goto L7e
            if (r12 != 0) goto L53
            goto L7e
        L53:
            q4.b$a r8 = new q4.b$a
            r9 = 0
            if (r6 == 0) goto L5e
            long r13 = java.lang.Long.parseLong(r6)
            goto L5f
        L5e:
            r13 = r9
        L5f:
            if (r7 == 0) goto L67
            long r6 = java.lang.Long.parseLong(r7)
            r15 = r6
            goto L68
        L67:
            r15 = r9
        L68:
            r10 = r8
            r10.<init>(r11, r12, r13, r15)
            int r6 = r5 + 1
            int r7 = r3.length
            if (r7 >= r6) goto L7a
            int r7 = r3.length
            int r7 = p026b9.AbstractC0710l.b.m2305a(r7, r6)
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r7)
        L7a:
            r3[r5] = r8
            r5 = r6
            goto L81
        L7e:
            b9.n<java.lang.Object> r0 = p026b9.C0693c0.f3898c0
            return r0
        L81:
            boolean r6 = p064e.C1494h.m4060k(r0, r1)
            if (r6 == 0) goto L1d
            b9.n r0 = p026b9.AbstractC0714n.m2309q(r3, r5)
            return r0
    }
}
