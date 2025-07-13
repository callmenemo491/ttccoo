package p340t8;

/* renamed from: t8.a */
/* loaded from: classes.dex */
public final class C6184a implements p340t8.InterfaceC6186c {

    /* renamed from: a */
    public final float f24030a;

    public C6184a(float r1) {
            r0 = this;
            r0.<init>()
            r0.f24030a = r1
            return
    }

    @Override // p340t8.InterfaceC6186c
    /* renamed from: a */
    public float mo12753a(android.graphics.RectF r1) {
            r0 = this;
            float r1 = r0.f24030a
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p340t8.C6184a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t8.a r4 = (p340t8.C6184a) r4
            float r1 = r3.f24030a
            float r4 = r4.f24030a
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            float r1 = r3.f24030a
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
