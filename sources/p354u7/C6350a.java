package p354u7;

/* renamed from: u7.a */
/* loaded from: classes.dex */
public class C6350a {

    /* renamed from: a */
    public static final android.animation.TimeInterpolator f24803a = null;

    /* renamed from: b */
    public static final android.animation.TimeInterpolator f24804b = null;

    /* renamed from: c */
    public static final android.animation.TimeInterpolator f24805c = null;

    /* renamed from: d */
    public static final android.animation.TimeInterpolator f24806d = null;

    /* renamed from: e */
    public static final android.animation.TimeInterpolator f24807e = null;

    static {
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            p354u7.C6350a.f24803a = r0
            y0.b r0 = new y0.b
            r0.<init>()
            p354u7.C6350a.f24804b = r0
            y0.a r0 = new y0.a
            r0.<init>()
            p354u7.C6350a.f24805c = r0
            y0.c r0 = new y0.c
            r0.<init>()
            p354u7.C6350a.f24806d = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            p354u7.C6350a.f24807e = r0
            return
    }

    /* renamed from: a */
    public static float m13003a(float r0, float r1, float r2) {
            float r0 = p346u.C6268m.m12887a(r1, r0, r2, r0)
            return r0
    }

    /* renamed from: b */
    public static int m13004b(int r0, int r1, float r2) {
            int r1 = r1 - r0
            float r1 = (float) r1
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            int r1 = r1 + r0
            return r1
    }
}
