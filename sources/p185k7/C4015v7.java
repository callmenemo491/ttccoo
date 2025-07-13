package p185k7;

/* renamed from: k7.v7 */
/* loaded from: classes.dex */
public final class C4015v7 implements java.util.Map.Entry, java.lang.Comparable<p185k7.C4015v7> {

    /* renamed from: Y */
    public final java.lang.Comparable f16909Y;

    /* renamed from: Z */
    public java.lang.Object f16910Z;

    /* renamed from: a0 */
    public final /* synthetic */ p185k7.C4067z7 f16911a0;

    public C4015v7(p185k7.C4067z7 r1, java.lang.Comparable r2, java.lang.Object r3) {
            r0 = this;
            r0.f16911a0 = r1
            r0.<init>()
            r0.f16909Y = r2
            r0.f16910Z = r3
            return
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(p185k7.C4015v7 r2) {
            r1 = this;
            k7.v7 r2 = (p185k7.C4015v7) r2
            java.lang.Comparable r0 = r1.f16909Y
            java.lang.Comparable r2 = r2.f16909Y
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Map.Entry
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Comparable r1 = r4.f16909Y
            java.lang.Object r3 = r5.getKey()
            if (r1 != 0) goto L1a
            if (r3 == 0) goto L18
            r1 = 0
            goto L1e
        L18:
            r1 = 1
            goto L1e
        L1a:
            boolean r1 = r1.equals(r3)
        L1e:
            if (r1 == 0) goto L35
            java.lang.Object r1 = r4.f16910Z
            java.lang.Object r5 = r5.getValue()
            if (r1 != 0) goto L2e
            if (r5 == 0) goto L2c
            r5 = 0
            goto L32
        L2c:
            r5 = 1
            goto L32
        L2e:
            boolean r5 = r1.equals(r5)
        L32:
            if (r5 == 0) goto L35
            return r0
        L35:
            return r2
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ java.lang.Object getKey() {
            r1 = this;
            java.lang.Comparable r0 = r1.f16909Y
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.f16910Z
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r3 = this;
            java.lang.Comparable r0 = r3.f16909Y
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            java.lang.Object r2 = r3.f16910Z
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r1 = r2.hashCode()
        L14:
            r0 = r0 ^ r1
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r3) {
            r2 = this;
            k7.z7 r0 = r2.f16911a0
            int r1 = p185k7.C4067z7.f16983e0
            r0.m9167h()
            java.lang.Object r0 = r2.f16910Z
            r2.f16910Z = r3
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.Comparable r0 = r5.f16909Y
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r5.f16910Z
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r0.length()
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 1
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "="
            java.lang.String r0 = p083f.C1932s.m4774a(r4, r0, r2, r1)
            return r0
    }
}
