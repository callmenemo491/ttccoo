package p192kf;

/* renamed from: kf.p */
/* loaded from: classes.dex */
public final class C4119p {

    /* renamed from: a */
    public final java.lang.String f17123a;

    /* renamed from: b */
    public final java.lang.String f17124b;

    /* renamed from: c */
    public final java.lang.String f17125c;

    /* renamed from: d */
    public final java.lang.String f17126d;

    /* renamed from: e */
    public final java.lang.String f17127e;

    /* renamed from: f */
    public final int f17128f;

    /* renamed from: g */
    public final java.util.List<p192kf.C4118o> f17129g;

    /* renamed from: h */
    public final int f17130h;

    /* renamed from: i */
    public final boolean f17131i;

    public C4119p(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, java.util.List<p192kf.C4118o> r8, int r9, boolean r10) {
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
            r1.f17123a = r2
            r1.f17124b = r3
            r1.f17125c = r4
            r1.f17126d = r5
            r1.f17127e = r6
            r1.f17128f = r7
            r1.f17129g = r8
            r1.f17130h = r9
            r1.f17131i = r10
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p192kf.C4119p
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kf.p r5 = (p192kf.C4119p) r5
            java.lang.String r1 = r4.f17123a
            java.lang.String r3 = r5.f17123a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f17124b
            java.lang.String r3 = r5.f17124b
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f17125c
            java.lang.String r3 = r5.f17125c
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f17126d
            java.lang.String r3 = r5.f17126d
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.f17127e
            java.lang.String r3 = r5.f17127e
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            int r1 = r4.f17128f
            int r3 = r5.f17128f
            if (r1 == r3) goto L4a
            return r2
        L4a:
            java.util.List<kf.o> r1 = r4.f17129g
            java.util.List<kf.o> r3 = r5.f17129g
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            int r1 = r4.f17130h
            int r3 = r5.f17130h
            if (r1 == r3) goto L5c
            return r2
        L5c:
            boolean r1 = r4.f17131i
            boolean r5 = r5.f17131i
            if (r1 == r5) goto L63
            return r2
        L63:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f17123a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.f17124b
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f17125c
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f17126d
            if (r1 != 0) goto L1c
            r1 = 0
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.f17127e
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.f17128f
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<kf.o> r1 = r3.f17129g
            int r0 = p255od.C5212k0.m11509a(r1, r0, r2)
            int r1 = r3.f17130h
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r3.f17131i
            if (r1 == 0) goto L40
            r1 = 1
        L40:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "LargeCardWithSlots(assets_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f17123a
            r0.append(r1)
            java.lang.String r1 = ", template_id="
            r0.append(r1)
            java.lang.String r1 = r2.f17124b
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r2.f17125c
            r0.append(r1)
            java.lang.String r1 = ", imageURL="
            r0.append(r1)
            java.lang.String r1 = r2.f17126d
            r0.append(r1)
            java.lang.String r1 = ", rarity="
            r0.append(r1)
            java.lang.String r1 = r2.f17127e
            r0.append(r1)
            java.lang.String r1 = ", slots="
            r0.append(r1)
            int r1 = r2.f17128f
            r0.append(r1)
            java.lang.String r1 = ", innerAssets="
            r0.append(r1)
            java.util.List<kf.o> r1 = r2.f17129g
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r2.f17130h
            r0.append(r1)
            java.lang.String r1 = ", isAnimal="
            r0.append(r1)
            boolean r1 = r2.f17131i
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
