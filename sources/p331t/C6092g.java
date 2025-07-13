package p331t;

/* renamed from: t.g */
/* loaded from: classes.dex */
public class C6092g extends p346u.AbstractInterpolatorC6271p {

    /* renamed from: a */
    public float f23489a;

    /* renamed from: b */
    public float f23490b;

    /* renamed from: c */
    public float f23491c;

    /* renamed from: d */
    public float f23492d;

    /* renamed from: e */
    public float f23493e;

    /* renamed from: f */
    public float f23494f;

    /* renamed from: g */
    public float f23495g;

    /* renamed from: h */
    public float f23496h;

    /* renamed from: i */
    public float f23497i;

    /* renamed from: j */
    public int f23498j;

    /* renamed from: k */
    public boolean f23499k;

    /* renamed from: l */
    public float f23500l;

    /* renamed from: m */
    public float f23501m;

    public C6092g() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f23499k = r0
            return
    }

    @Override // p346u.AbstractInterpolatorC6271p
    /* renamed from: a */
    public float mo881a() {
            r1 = this;
            boolean r0 = r1.f23499k
            if (r0 == 0) goto Lc
            float r0 = r1.f23501m
            float r0 = r1.m12551c(r0)
            float r0 = -r0
            goto L12
        Lc:
            float r0 = r1.f23501m
            float r0 = r1.m12551c(r0)
        L12:
            return r0
    }

    /* renamed from: b */
    public void m12550b(float r7, float r8, float r9, float r10, float r11, float r12) {
            r6 = this;
            r6.f23500l = r7
            int r1 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r1 <= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            r6.f23499k = r1
            if (r1 == 0) goto L12
            float r1 = -r9
            float r2 = r7 - r8
            r0 = r6
            goto L16
        L12:
            float r2 = r8 - r7
            r0 = r6
            r1 = r9
        L16:
            r3 = r11
            r4 = r12
            r5 = r10
            r0.m12552d(r1, r2, r3, r4, r5)
            return
    }

    /* renamed from: c */
    public float m12551c(float r4) {
            r3 = this;
            float r0 = r3.f23492d
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 > 0) goto L10
            float r1 = r3.f23489a
            float r2 = r3.f23490b
        La:
            float r2 = r2 - r1
            float r2 = r2 * r4
            float r2 = r2 / r0
            float r2 = r2 + r1
            return r2
        L10:
            int r1 = r3.f23498j
            r2 = 1
            if (r1 != r2) goto L17
            r4 = 0
            return r4
        L17:
            float r4 = r4 - r0
            float r0 = r3.f23493e
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L23
            float r1 = r3.f23490b
            float r2 = r3.f23491c
            goto La
        L23:
            r2 = 2
            if (r1 != r2) goto L29
            float r4 = r3.f23496h
            return r4
        L29:
            float r4 = r4 - r0
            float r0 = r3.f23494f
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L37
            float r1 = r3.f23491c
            float r4 = r4 * r1
            float r4 = r4 / r0
            float r1 = r1 - r4
            return r1
        L37:
            float r4 = r3.f23497i
            return r4
    }

    /* renamed from: d */
    public final void m12552d(float r9, float r10, float r11, float r12, float r13) {
            r8 = this;
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 != 0) goto L8
            r9 = 953267991(0x38d1b717, float:1.0E-4)
        L8:
            r8.f23489a = r9
            float r1 = r9 / r11
            float r2 = r1 * r9
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            r4 = 3
            r5 = 2
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 >= 0) goto L6d
            float r13 = -r9
            float r13 = r13 / r11
            float r13 = r13 * r9
            float r13 = r13 / r3
            float r13 = r10 - r13
            float r13 = r13 * r11
            double r1 = (double) r13
            double r1 = java.lang.Math.sqrt(r1)
            float r13 = (float) r1
            int r1 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r1 >= 0) goto L46
            r8.f23498j = r5
            r8.f23489a = r9
            r8.f23490b = r13
            r8.f23491c = r0
            float r12 = r13 - r9
            float r12 = r12 / r11
            r8.f23492d = r12
            float r11 = r13 / r11
            r8.f23493e = r11
            float r9 = r9 + r13
            float r9 = r9 * r12
            float r9 = r9 / r3
            r8.f23495g = r9
            r8.f23496h = r10
            r8.f23497i = r10
            return
        L46:
            r8.f23498j = r4
            r8.f23489a = r9
            r8.f23490b = r12
            r8.f23491c = r12
            float r13 = r12 - r9
            float r13 = r13 / r11
            r8.f23492d = r13
            float r11 = r12 / r11
            r8.f23494f = r11
            float r9 = r9 + r12
            float r9 = r9 * r13
            float r9 = r9 / r3
            float r11 = r11 * r12
            float r11 = r11 / r3
            float r13 = r10 - r9
            float r13 = r13 - r11
            float r13 = r13 / r12
            r8.f23493e = r13
            r8.f23495g = r9
            float r9 = r10 - r11
            r8.f23496h = r9
            r8.f23497i = r10
            return
        L6d:
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 < 0) goto L80
            float r3 = r3 * r10
            float r3 = r3 / r9
            r11 = 1
            r8.f23498j = r11
            r8.f23489a = r9
            r8.f23490b = r0
            r8.f23495g = r10
            r8.f23492d = r3
            return
        L80:
            float r2 = r10 - r2
            float r6 = r2 / r9
            float r7 = r6 + r1
            int r13 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r13 >= 0) goto L9b
            r8.f23498j = r5
            r8.f23489a = r9
            r8.f23490b = r9
            r8.f23491c = r0
            r8.f23495g = r2
            r8.f23496h = r10
            r8.f23492d = r6
            r8.f23493e = r1
            return
        L9b:
            float r13 = r11 * r10
            float r1 = r9 * r9
            float r1 = r1 / r3
            float r1 = r1 + r13
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r13 = (float) r1
            float r1 = r13 - r9
            float r1 = r1 / r11
            r8.f23492d = r1
            float r2 = r13 / r11
            r8.f23493e = r2
            int r6 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r6 >= 0) goto Lc9
            r8.f23498j = r5
            r8.f23489a = r9
            r8.f23490b = r13
            r8.f23491c = r0
            r8.f23492d = r1
            r8.f23493e = r2
            float r9 = r9 + r13
            float r9 = r9 * r1
            float r9 = r9 / r3
            r8.f23495g = r9
            r8.f23496h = r10
            return
        Lc9:
            r8.f23498j = r4
            r8.f23489a = r9
            r8.f23490b = r12
            r8.f23491c = r12
            float r13 = r12 - r9
            float r13 = r13 / r11
            r8.f23492d = r13
            float r11 = r12 / r11
            r8.f23494f = r11
            float r9 = r9 + r12
            float r9 = r9 * r13
            float r9 = r9 / r3
            float r11 = r11 * r12
            float r11 = r11 / r3
            float r13 = r10 - r9
            float r13 = r13 - r11
            float r13 = r13 / r12
            r8.f23493e = r13
            r8.f23495g = r9
            float r9 = r10 - r11
            r8.f23496h = r9
            r8.f23497i = r10
            return
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r7) {
            r6 = this;
            float r0 = r6.f23492d
            r1 = 1073741824(0x40000000, float:2.0)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L18
            float r2 = r6.f23489a
            float r3 = r2 * r7
            float r4 = r6.f23490b
            float r4 = r4 - r2
            float r4 = r4 * r7
            float r4 = r4 * r7
            float r0 = r0 * r1
            float r4 = r4 / r0
            float r4 = r4 + r3
            goto L5a
        L18:
            int r2 = r6.f23498j
            r3 = 1
            if (r2 != r3) goto L20
            float r4 = r6.f23495g
            goto L5a
        L20:
            float r0 = r7 - r0
            float r3 = r6.f23493e
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 >= 0) goto L3c
            float r2 = r6.f23495g
            float r4 = r6.f23490b
            float r5 = r4 * r0
            float r5 = r5 + r2
            float r2 = r6.f23491c
            float r2 = r2 - r4
            float r2 = r2 * r0
            float r2 = r2 * r0
            float r3 = r3 * r1
            float r2 = r2 / r3
            float r4 = r2 + r5
            goto L5a
        L3c:
            r4 = 2
            if (r2 != r4) goto L42
            float r4 = r6.f23496h
            goto L5a
        L42:
            float r0 = r0 - r3
            float r2 = r6.f23494f
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L58
            float r3 = r6.f23496h
            float r4 = r6.f23491c
            float r4 = r4 * r0
            float r3 = r3 + r4
            float r4 = r4 * r0
            float r2 = r2 * r1
            float r4 = r4 / r2
            float r4 = r3 - r4
            goto L5a
        L58:
            float r4 = r6.f23497i
        L5a:
            r6.f23501m = r7
            boolean r7 = r6.f23499k
            if (r7 == 0) goto L64
            float r7 = r6.f23500l
            float r7 = r7 - r4
            goto L67
        L64:
            float r7 = r6.f23500l
            float r7 = r7 + r4
        L67:
            return r7
    }
}
