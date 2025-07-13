package p340t8;

/* renamed from: t8.g */
/* loaded from: classes.dex */
public final class C6190g implements p340t8.InterfaceC6186c {

    /* renamed from: a */
    public final float f24081a;

    public C6190g(float r1) {
            r0 = this;
            r0.<init>()
            r0.f24081a = r1
            return
    }

    @Override // p340t8.InterfaceC6186c
    /* renamed from: a */
    public float mo12753a(android.graphics.RectF r2) {
            r1 = this;
            float r0 = r1.f24081a
            float r2 = r2.height()
            float r2 = r2 * r0
            return r2
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p340t8.C6190g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t8.g r4 = (p340t8.C6190g) r4
            float r1 = r3.f24081a
            float r4 = r4.f24081a
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
            float r1 = r3.f24081a
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
