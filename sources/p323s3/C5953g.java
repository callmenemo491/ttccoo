package p323s3;

/* renamed from: s3.g */
/* loaded from: classes.dex */
public class C5953g {

    /* renamed from: a */
    public final android.graphics.Matrix f22865a;

    /* renamed from: b */
    public android.graphics.RectF f22866b;

    /* renamed from: c */
    public float f22867c;

    /* renamed from: d */
    public float f22868d;

    /* renamed from: e */
    public float f22869e;

    /* renamed from: f */
    public float f22870f;

    /* renamed from: g */
    public float f22871g;

    /* renamed from: h */
    public float f22872h;

    /* renamed from: i */
    public float f22873i;

    /* renamed from: j */
    public float f22874j;

    /* renamed from: k */
    public float f22875k;

    /* renamed from: l */
    public float f22876l;

    /* renamed from: m */
    public float f22877m;

    /* renamed from: n */
    public android.graphics.Matrix f22878n;

    /* renamed from: o */
    public final float[] f22879o;

    public C5953g() {
            r3 = this;
            r3.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3.f22865a = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r3.f22866b = r0
            r0 = 0
            r3.f22867c = r0
            r3.f22868d = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.f22869e = r1
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.f22870f = r2
            r3.f22871g = r1
            r3.f22872h = r2
            r3.f22873i = r1
            r3.f22874j = r1
            r3.f22875k = r0
            r3.f22876l = r0
            r3.f22877m = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3.f22878n = r0
            r0 = 9
            float[] r0 = new float[r0]
            r3.f22879o = r0
            return
    }

    /* renamed from: a */
    public float m12380a() {
            r1 = this;
            android.graphics.RectF r0 = r1.f22866b
            float r0 = r0.width()
            return r0
    }

    /* renamed from: b */
    public boolean m12381b() {
            r2 = this;
            float r0 = r2.f22873i
            float r1 = r2.f22871g
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    /* renamed from: c */
    public boolean m12382c() {
            r2 = this;
            float r0 = r2.f22874j
            float r1 = r2.f22869e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    /* renamed from: d */
    public boolean m12383d(float r2) {
            r1 = this;
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            float r2 = (float) r2
            float r2 = r2 / r0
            android.graphics.RectF r0 = r1.f22866b
            float r0 = r0.bottom
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
    }

    /* renamed from: e */
    public boolean m12384e(float r3) {
            r2 = this;
            android.graphics.RectF r0 = r2.f22866b
            float r0 = r0.left
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            return r3
    }

    /* renamed from: f */
    public boolean m12385f(float r3) {
            r2 = this;
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = (int) r3
            float r3 = (float) r3
            float r3 = r3 / r0
            android.graphics.RectF r0 = r2.f22866b
            float r0 = r0.right
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            return r3
    }

    /* renamed from: g */
    public boolean m12386g(float r2) {
            r1 = this;
            android.graphics.RectF r0 = r1.f22866b
            float r0 = r0.top
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    /* renamed from: h */
    public boolean m12387h(float r2) {
            r1 = this;
            boolean r0 = r1.m12384e(r2)
            if (r0 == 0) goto Le
            boolean r2 = r1.m12385f(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    /* renamed from: i */
    public boolean m12388i(float r2) {
            r1 = this;
            boolean r0 = r1.m12386g(r2)
            if (r0 == 0) goto Le
            boolean r2 = r1.m12383d(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    /* renamed from: j */
    public void m12389j(android.graphics.Matrix r10, android.graphics.RectF r11) {
            r9 = this;
            float[] r0 = r9.f22879o
            r10.getValues(r0)
            float[] r0 = r9.f22879o
            r1 = 2
            r2 = r0[r1]
            r3 = 0
            r4 = r0[r3]
            r5 = 5
            r6 = r0[r5]
            r7 = 4
            r0 = r0[r7]
            float r8 = r9.f22871g
            float r4 = java.lang.Math.max(r8, r4)
            float r8 = r9.f22872h
            float r4 = java.lang.Math.min(r4, r8)
            r9.f22873i = r4
            float r4 = r9.f22869e
            float r0 = java.lang.Math.max(r4, r0)
            float r4 = r9.f22870f
            float r0 = java.lang.Math.min(r0, r4)
            r9.f22874j = r0
            r0 = 0
            if (r11 == 0) goto L3b
            float r0 = r11.width()
            float r11 = r11.height()
            goto L3c
        L3b:
            r11 = 0
        L3c:
            float r0 = -r0
            float r4 = r9.f22873i
            r8 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r8
            float r4 = r4 * r0
            float r0 = r9.f22876l
            float r4 = r4 - r0
            float r0 = java.lang.Math.max(r2, r4)
            float r2 = r9.f22876l
            float r0 = java.lang.Math.min(r0, r2)
            r9.f22875k = r0
            float r0 = r9.f22874j
            float r0 = r0 - r8
            float r0 = r0 * r11
            float r11 = r9.f22877m
            float r0 = r0 + r11
            float r11 = java.lang.Math.min(r6, r0)
            float r0 = r9.f22877m
            float r0 = -r0
            float r11 = java.lang.Math.max(r11, r0)
            float[] r0 = r9.f22879o
            float r2 = r9.f22875k
            r0[r1] = r2
            float r1 = r9.f22873i
            r0[r3] = r1
            r0[r5] = r11
            float r11 = r9.f22874j
            r0[r7] = r11
            r10.setValues(r0)
            return
    }

    /* renamed from: k */
    public float m12390k() {
            r2 = this;
            float r0 = r2.f22868d
            android.graphics.RectF r1 = r2.f22866b
            float r1 = r1.bottom
            float r0 = r0 - r1
            return r0
    }

    /* renamed from: l */
    public float m12391l() {
            r2 = this;
            float r0 = r2.f22867c
            android.graphics.RectF r1 = r2.f22866b
            float r1 = r1.right
            float r0 = r0 - r1
            return r0
    }

    /* renamed from: m */
    public android.graphics.Matrix m12392m(android.graphics.Matrix r3, android.view.View r4, boolean r5) {
            r2 = this;
            android.graphics.Matrix r0 = r2.f22865a
            r0.set(r3)
            android.graphics.Matrix r0 = r2.f22865a
            android.graphics.RectF r1 = r2.f22866b
            r2.m12389j(r0, r1)
            if (r5 == 0) goto L11
            r4.invalidate()
        L11:
            android.graphics.Matrix r4 = r2.f22865a
            r3.set(r4)
            return r3
    }

    /* renamed from: n */
    public void m12393n(float r3, float r4, float r5, float r6) {
            r2 = this;
            android.graphics.RectF r0 = r2.f22866b
            float r1 = r2.f22867c
            float r1 = r1 - r5
            float r5 = r2.f22868d
            float r5 = r5 - r6
            r0.set(r3, r4, r1, r5)
            return
    }
}
