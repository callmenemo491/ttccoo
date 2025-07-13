package p255od;

/* renamed from: od.t */
/* loaded from: classes.dex */
public final class C5229t {
    private final java.lang.String description;
    private final java.lang.String img;
    private final java.lang.String name;
    private final p255od.EnumC5202f0 rarity;
    private final java.lang.String series;
    private final java.lang.String type;
    private final java.lang.String website;

    public C5229t(java.lang.String r2, java.lang.String r3, java.lang.String r4, p255od.EnumC5202f0 r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r1 = this;
            java.lang.String r0 = "description"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "img"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "series"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "type"
            p214m2.C4339q.m9706k(r7, r0)
            java.lang.String r0 = "website"
            p214m2.C4339q.m9706k(r8, r0)
            r1.<init>()
            r1.description = r2
            r1.img = r3
            r1.name = r4
            r1.rarity = r5
            r1.series = r6
            r1.type = r7
            r1.website = r8
            return
    }

    public static /* synthetic */ p255od.C5229t copy$default(p255od.C5229t r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, p255od.EnumC5202f0 r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, java.lang.Object r14) {
            r14 = r13 & 1
            if (r14 == 0) goto L6
            java.lang.String r6 = r5.description
        L6:
            r14 = r13 & 2
            if (r14 == 0) goto Lc
            java.lang.String r7 = r5.img
        Lc:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L13
            java.lang.String r8 = r5.name
        L13:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L1a
            od.f0 r9 = r5.rarity
        L1a:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L21
            java.lang.String r10 = r5.series
        L21:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L28
            java.lang.String r11 = r5.type
        L28:
            r3 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L2f
            java.lang.String r12 = r5.website
        L2f:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            od.t r5 = r7.copy(r8, r9, r10, r11, r12, r13, r14)
            return r5
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.description
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.img
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final p255od.EnumC5202f0 component4() {
            r1 = this;
            od.f0 r0 = r1.rarity
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.series
            return r0
    }

    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.website
            return r0
    }

    public final p255od.C5229t copy(java.lang.String r10, java.lang.String r11, java.lang.String r12, p255od.EnumC5202f0 r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
            r9 = this;
            java.lang.String r0 = "description"
            r2 = r10
            p214m2.C4339q.m9706k(r10, r0)
            java.lang.String r0 = "img"
            r3 = r11
            p214m2.C4339q.m9706k(r11, r0)
            java.lang.String r0 = "name"
            r4 = r12
            p214m2.C4339q.m9706k(r12, r0)
            java.lang.String r0 = "series"
            r6 = r14
            p214m2.C4339q.m9706k(r14, r0)
            java.lang.String r0 = "type"
            r7 = r15
            p214m2.C4339q.m9706k(r15, r0)
            java.lang.String r0 = "website"
            r8 = r16
            p214m2.C4339q.m9706k(r8, r0)
            od.t r0 = new od.t
            r1 = r0
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5229t
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.t r5 = (p255od.C5229t) r5
            java.lang.String r1 = r4.description
            java.lang.String r3 = r5.description
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.img
            java.lang.String r3 = r5.img
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            od.f0 r1 = r4.rarity
            od.f0 r3 = r5.rarity
            if (r1 == r3) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.series
            java.lang.String r3 = r5.series
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.String r1 = r4.type
            java.lang.String r3 = r5.type
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            java.lang.String r1 = r4.website
            java.lang.String r5 = r5.website
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L55
            return r2
        L55:
            return r0
    }

    public final java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.description
            return r0
    }

    public final java.lang.String getImg() {
            r1 = this;
            java.lang.String r0 = r1.img
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final p255od.EnumC5202f0 getRarity() {
            r1 = this;
            od.f0 r0 = r1.rarity
            return r0
    }

    public final java.lang.String getSeries() {
            r1 = this;
            java.lang.String r0 = r1.series
            return r0
    }

    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public final java.lang.String getWebsite() {
            r1 = this;
            java.lang.String r0 = r1.website
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.description
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.img
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.name
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            od.f0 r1 = r3.rarity
            if (r1 != 0) goto L1c
            r1 = 0
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.series
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.type
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.website
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ImmutableData(description="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.description
            r0.append(r1)
            java.lang.String r1 = ", img="
            r0.append(r1)
            java.lang.String r1 = r3.img
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", rarity="
            r0.append(r1)
            od.f0 r1 = r3.rarity
            r0.append(r1)
            java.lang.String r1 = ", series="
            r0.append(r1)
            java.lang.String r1 = r3.series
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            java.lang.String r1 = r3.type
            r0.append(r1)
            java.lang.String r1 = ", website="
            r0.append(r1)
            java.lang.String r1 = r3.website
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
