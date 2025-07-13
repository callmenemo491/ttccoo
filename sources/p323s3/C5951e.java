package p323s3;

/* renamed from: s3.e */
/* loaded from: classes.dex */
public class C5951e {

    /* renamed from: a */
    public android.graphics.Matrix f22848a;

    /* renamed from: b */
    public android.graphics.Matrix f22849b;

    /* renamed from: c */
    public p323s3.C5953g f22850c;

    /* renamed from: d */
    public float[] f22851d;

    /* renamed from: e */
    public android.graphics.Matrix f22852e;

    /* renamed from: f */
    public float[] f22853f;

    /* renamed from: g */
    public android.graphics.Matrix f22854g;

    public C5951e(p323s3.C5953g r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f22848a = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f22849b = r0
            r0 = 1
            float[] r0 = new float[r0]
            r1.f22851d = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f22852e = r0
            r0 = 2
            float[] r0 = new float[r0]
            r1.f22853f = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f22854g = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f22850c = r2
            return
    }

    /* renamed from: a */
    public p323s3.C5948b m12366a(float r3, float r4) {
            r2 = this;
            float[] r0 = r2.f22853f
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r2.m12371f(r0)
            float[] r4 = r2.f22853f
            r0 = r4[r1]
            double r0 = (double) r0
            r3 = r4[r3]
            double r3 = (double) r3
            s3.b r3 = p323s3.C5948b.m12358b(r0, r3)
            return r3
    }

    /* renamed from: b */
    public p323s3.C5948b m12367b(float r3, float r4) {
            r2 = this;
            r0 = 0
            s3.b r0 = p323s3.C5948b.m12358b(r0, r0)
            r2.m12368c(r3, r4, r0)
            return r0
    }

    /* renamed from: c */
    public void m12368c(float r3, float r4, p323s3.C5948b r5) {
            r2 = this;
            float[] r0 = r2.f22853f
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r2.m12370e(r0)
            float[] r4 = r2.f22853f
            r0 = r4[r1]
            double r0 = (double) r0
            r5.f22835b = r0
            r3 = r4[r3]
            double r3 = (double) r3
            r5.f22836c = r3
            return
    }

    /* renamed from: d */
    public void m12369d(android.graphics.Path r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.f22848a
            r2.transform(r0)
            s3.g r0 = r1.f22850c
            android.graphics.Matrix r0 = r0.f22865a
            r2.transform(r0)
            android.graphics.Matrix r0 = r1.f22849b
            r2.transform(r0)
            return
    }

    /* renamed from: e */
    public void m12370e(float[] r3) {
            r2 = this;
            android.graphics.Matrix r0 = r2.f22852e
            r0.reset()
            android.graphics.Matrix r1 = r2.f22849b
            r1.invert(r0)
            r0.mapPoints(r3)
            s3.g r1 = r2.f22850c
            android.graphics.Matrix r1 = r1.f22865a
            r1.invert(r0)
            r0.mapPoints(r3)
            android.graphics.Matrix r1 = r2.f22848a
            r1.invert(r0)
            r0.mapPoints(r3)
            return
    }

    /* renamed from: f */
    public void m12371f(float[] r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.f22848a
            r0.mapPoints(r2)
            s3.g r0 = r1.f22850c
            android.graphics.Matrix r0 = r0.f22865a
            r0.mapPoints(r2)
            android.graphics.Matrix r0 = r1.f22849b
            r0.mapPoints(r2)
            return
    }

    /* renamed from: g */
    public void m12372g(boolean r4) {
            r3 = this;
            android.graphics.Matrix r0 = r3.f22849b
            r0.reset()
            if (r4 != 0) goto L1a
            android.graphics.Matrix r4 = r3.f22849b
            s3.g r0 = r3.f22850c
            android.graphics.RectF r1 = r0.f22866b
            float r1 = r1.left
            float r2 = r0.f22868d
            float r0 = r0.m12390k()
            float r2 = r2 - r0
            r4.postTranslate(r1, r2)
            goto L31
        L1a:
            android.graphics.Matrix r4 = r3.f22849b
            s3.g r0 = r3.f22850c
            android.graphics.RectF r0 = r0.f22866b
            float r1 = r0.left
            float r0 = r0.top
            float r0 = -r0
            r4.setTranslate(r1, r0)
            android.graphics.Matrix r4 = r3.f22849b
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.postScale(r0, r1)
        L31:
            return
    }

    /* renamed from: h */
    public void m12373h(float r3, float r4, float r5, float r6) {
            r2 = this;
            s3.g r0 = r2.f22850c
            float r0 = r0.m12380a()
            float r0 = r0 / r4
            s3.g r4 = r2.f22850c
            android.graphics.RectF r4 = r4.f22866b
            float r4 = r4.height()
            float r4 = r4 / r5
            boolean r5 = java.lang.Float.isInfinite(r0)
            r1 = 0
            if (r5 == 0) goto L18
            r0 = 0
        L18:
            boolean r5 = java.lang.Float.isInfinite(r4)
            if (r5 == 0) goto L1f
            r4 = 0
        L1f:
            android.graphics.Matrix r5 = r2.f22848a
            r5.reset()
            android.graphics.Matrix r5 = r2.f22848a
            float r3 = -r3
            float r6 = -r6
            r5.postTranslate(r3, r6)
            android.graphics.Matrix r3 = r2.f22848a
            float r4 = -r4
            r3.postScale(r0, r4)
            return
    }
}
