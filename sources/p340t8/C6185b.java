package p340t8;

/* renamed from: t8.b */
/* loaded from: classes.dex */
public final class C6185b implements p340t8.InterfaceC6186c {

    /* renamed from: a */
    public final p340t8.InterfaceC6186c f24031a;

    /* renamed from: b */
    public final float f24032b;

    public C6185b(float r2, p340t8.InterfaceC6186c r3) {
            r1 = this;
            r1.<init>()
        L3:
            boolean r0 = r3 instanceof p340t8.C6185b
            if (r0 == 0) goto L12
            t8.b r3 = (p340t8.C6185b) r3
            t8.c r3 = r3.f24031a
            r0 = r3
            t8.b r0 = (p340t8.C6185b) r0
            float r0 = r0.f24032b
            float r2 = r2 + r0
            goto L3
        L12:
            r1.f24031a = r3
            r1.f24032b = r2
            return
    }

    @Override // p340t8.InterfaceC6186c
    /* renamed from: a */
    public float mo12753a(android.graphics.RectF r2) {
            r1 = this;
            t8.c r0 = r1.f24031a
            float r2 = r0.mo12753a(r2)
            float r0 = r1.f24032b
            float r2 = r2 + r0
            r0 = 0
            float r2 = java.lang.Math.max(r0, r2)
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p340t8.C6185b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t8.b r5 = (p340t8.C6185b) r5
            t8.c r1 = r4.f24031a
            t8.c r3 = r5.f24031a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1f
            float r1 = r4.f24032b
            float r5 = r5.f24032b
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L1f
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            t8.c r1 = r3.f24031a
            r2 = 0
            r0[r2] = r1
            float r1 = r3.f24032b
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
