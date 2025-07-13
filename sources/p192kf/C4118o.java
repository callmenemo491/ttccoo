package p192kf;

/* renamed from: kf.o */
/* loaded from: classes.dex */
public final class C4118o {

    /* renamed from: a */
    public final java.lang.String f17112a;

    /* renamed from: b */
    public final java.lang.String f17113b;

    /* renamed from: c */
    public final java.lang.String f17114c;

    /* renamed from: d */
    public final java.lang.String f17115d;

    /* renamed from: e */
    public final java.lang.String f17116e;

    /* renamed from: f */
    public final int f17117f;

    /* renamed from: g */
    public final java.lang.String f17118g;

    /* renamed from: h */
    public final java.lang.Integer f17119h;

    /* renamed from: i */
    public final int f17120i;

    /* renamed from: j */
    public final long f17121j;

    /* renamed from: k */
    public final boolean f17122k;

    public C4118o(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, java.lang.String r8, java.lang.Integer r9, int r10, long r11, boolean r13) {
            r1 = this;
            java.lang.String r0 = "assets_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "rarity"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.f17112a = r2
            r1.f17113b = r3
            r1.f17114c = r4
            r1.f17115d = r5
            r1.f17116e = r6
            r1.f17117f = r7
            r1.f17118g = r8
            r1.f17119h = r9
            r1.f17120i = r10
            r1.f17121j = r11
            r1.f17122k = r13
            return
    }

    /* renamed from: a */
    public static final p192kf.C4118o m9186a(nf.C4800b r14, nf.C4807i r15, long r16) {
            java.lang.String r0 = "asset"
            r1 = r14
            p214m2.C4339q.m9706k(r14, r0)
            java.lang.String r0 = "confanimal"
            r2 = r15
            p214m2.C4339q.m9706k(r15, r0)
            kf.o r0 = new kf.o
            java.lang.String r3 = r14.getAsset_id()
            nf.b$b r4 = r14.getTemplate()
            java.lang.String r4 = r4.getTemplate_id()
            java.lang.String r5 = r14.getName()
            nf.b$b r6 = r14.getTemplate()
            nf.b$b$a r6 = r6.getImmutable_data()
            java.lang.String r6 = r6.getImageUrl()
            nf.b$b r1 = r14.getTemplate()
            nf.b$b$a r1 = r1.getImmutable_data()
            java.lang.String r7 = r1.getRarity()
            java.lang.String r1 = r15.getResource_type()
            java.lang.String r1 = p223mf.C4596a.m10448a(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = r15.getResource_type()
        L44:
            r8 = r1
            int r1 = r15.getResource_count()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            int r10 = r15.getCooldown()
            r13 = 1
            r11 = 0
            r1 = r0
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r11
            r11 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p192kf.C4118o
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kf.o r8 = (p192kf.C4118o) r8
            java.lang.String r1 = r7.f17112a
            java.lang.String r3 = r8.f17112a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f17113b
            java.lang.String r3 = r8.f17113b
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.f17114c
            java.lang.String r3 = r8.f17114c
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.f17115d
            java.lang.String r3 = r8.f17115d
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r7.f17116e
            java.lang.String r3 = r8.f17116e
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            int r1 = r7.f17117f
            int r3 = r8.f17117f
            if (r1 == r3) goto L4a
            return r2
        L4a:
            java.lang.String r1 = r7.f17118g
            java.lang.String r3 = r8.f17118g
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            java.lang.Integer r1 = r7.f17119h
            java.lang.Integer r3 = r8.f17119h
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L60
            return r2
        L60:
            int r1 = r7.f17120i
            int r3 = r8.f17120i
            if (r1 == r3) goto L67
            return r2
        L67:
            long r3 = r7.f17121j
            long r5 = r8.f17121j
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L70
            return r2
        L70:
            boolean r1 = r7.f17122k
            boolean r8 = r8.f17122k
            if (r1 == r8) goto L77
            return r2
        L77:
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f17112a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r5.f17113b
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.f17114c
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.f17115d
            r2 = 0
            if (r1 != 0) goto L1d
            r1 = 0
            goto L21
        L1d:
            int r1 = r1.hashCode()
        L21:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r5.f17116e
            r3 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r3)
            int r1 = r5.f17117f
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r5.f17118g
            if (r1 != 0) goto L37
            r1 = 0
            goto L3b
        L37:
            int r1 = r1.hashCode()
        L3b:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Integer r1 = r5.f17119h
            if (r1 != 0) goto L43
            goto L47
        L43:
            int r2 = r1.hashCode()
        L47:
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r5.f17120i
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r5.f17121j
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r1 = r5.f17122k
            if (r1 == 0) goto L5f
            r1 = 1
        L5f:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "InnerAsset(assets_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f17112a
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            java.lang.String r1 = r3.f17113b
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.f17114c
            r0.append(r1)
            java.lang.String r1 = ", imageURL="
            r0.append(r1)
            java.lang.String r1 = r3.f17115d
            r0.append(r1)
            java.lang.String r1 = ", rarity="
            r0.append(r1)
            java.lang.String r1 = r3.f17116e
            r0.append(r1)
            java.lang.String r1 = ", sestAmount="
            r0.append(r1)
            int r1 = r3.f17117f
            r0.append(r1)
            java.lang.String r1 = ", resourceLabel="
            r0.append(r1)
            java.lang.String r1 = r3.f17118g
            r0.append(r1)
            java.lang.String r1 = ", resourceCount="
            r0.append(r1)
            java.lang.Integer r1 = r3.f17119h
            r0.append(r1)
            java.lang.String r1 = ", cooldown="
            r0.append(r1)
            int r1 = r3.f17120i
            r0.append(r1)
            java.lang.String r1 = ", last_harvest="
            r0.append(r1)
            long r1 = r3.f17121j
            r0.append(r1)
            java.lang.String r1 = ", isAnimal="
            r0.append(r1)
            boolean r1 = r3.f17122k
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
