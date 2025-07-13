package p192kf;

/* renamed from: kf.q */
/* loaded from: classes.dex */
public final class C4120q {

    /* renamed from: a */
    public final java.lang.String f17132a;

    /* renamed from: b */
    public final java.lang.String f17133b;

    /* renamed from: c */
    public final java.lang.String f17134c;

    /* renamed from: d */
    public final java.lang.String f17135d;

    /* renamed from: e */
    public final int f17136e;

    /* renamed from: f */
    public final int f17137f;

    /* renamed from: g */
    public final int f17138g;

    /* renamed from: h */
    public final long f17139h;

    /* renamed from: i */
    public final int f17140i;

    public C4120q(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8, long r9, int r11, int r12) {
            r1 = this;
            r0 = r12 & 16
            if (r0 == 0) goto L5
            r6 = 0
        L5:
            r12 = r12 & 32
            if (r12 == 0) goto La
            r7 = 0
        La:
            java.lang.String r12 = "assets_id"
            p214m2.C4339q.m9706k(r2, r12)
            java.lang.String r12 = "name"
            p214m2.C4339q.m9706k(r3, r12)
            java.lang.String r12 = "rarity"
            p214m2.C4339q.m9706k(r5, r12)
            r1.<init>()
            r1.f17132a = r2
            r1.f17133b = r3
            r1.f17134c = r4
            r1.f17135d = r5
            r1.f17136e = r6
            r1.f17137f = r7
            r1.f17138g = r8
            r1.f17139h = r9
            r1.f17140i = r11
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p192kf.C4120q
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kf.q r8 = (p192kf.C4120q) r8
            java.lang.String r1 = r7.f17132a
            java.lang.String r3 = r8.f17132a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f17133b
            java.lang.String r3 = r8.f17133b
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.f17134c
            java.lang.String r3 = r8.f17134c
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.f17135d
            java.lang.String r3 = r8.f17135d
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            int r1 = r7.f17136e
            int r3 = r8.f17136e
            if (r1 == r3) goto L3f
            return r2
        L3f:
            int r1 = r7.f17137f
            int r3 = r8.f17137f
            if (r1 == r3) goto L46
            return r2
        L46:
            int r1 = r7.f17138g
            int r3 = r8.f17138g
            if (r1 == r3) goto L4d
            return r2
        L4d:
            long r3 = r7.f17139h
            long r5 = r8.f17139h
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L56
            return r2
        L56:
            int r1 = r7.f17140i
            int r8 = r8.f17140i
            if (r1 == r8) goto L5d
            return r2
        L5d:
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f17132a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r5.f17133b
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.f17134c
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            int r1 = r1.hashCode()
        L1a:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r5.f17135d
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r5.f17136e
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r5.f17137f
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r5.f17138g
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r5.f17139h
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r5.f17140i
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "SingleCard(assets_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f17132a
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.f17133b
            r0.append(r1)
            java.lang.String r1 = ", imageURL="
            r0.append(r1)
            java.lang.String r1 = r3.f17134c
            r0.append(r1)
            java.lang.String r1 = ", rarity="
            r0.append(r1)
            java.lang.String r1 = r3.f17135d
            r0.append(r1)
            java.lang.String r1 = ", sestAmount="
            r0.append(r1)
            int r1 = r3.f17136e
            r0.append(r1)
            java.lang.String r1 = ", cbitAmount="
            r0.append(r1)
            int r1 = r3.f17137f
            r0.append(r1)
            java.lang.String r1 = ", cooldown="
            r0.append(r1)
            int r1 = r3.f17138g
            r0.append(r1)
            java.lang.String r1 = ", last_harvest="
            r0.append(r1)
            long r1 = r3.f17139h
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r3.f17140i
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
