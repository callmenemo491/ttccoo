package p354u7;

/* renamed from: u7.h */
/* loaded from: classes.dex */
public class C6357h {

    /* renamed from: a */
    public long f24817a;

    /* renamed from: b */
    public long f24818b;

    /* renamed from: c */
    public android.animation.TimeInterpolator f24819c;

    /* renamed from: d */
    public int f24820d;

    /* renamed from: e */
    public int f24821e;

    public C6357h(long r3, long r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f24817a = r0
            r0 = 300(0x12c, double:1.48E-321)
            r2.f24818b = r0
            r0 = 0
            r2.f24819c = r0
            r0 = 0
            r2.f24820d = r0
            r0 = 1
            r2.f24821e = r0
            r2.f24817a = r3
            r2.f24818b = r5
            return
    }

    public C6357h(long r3, long r5, android.animation.TimeInterpolator r7) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f24817a = r0
            r0 = 300(0x12c, double:1.48E-321)
            r2.f24818b = r0
            r0 = 0
            r2.f24819c = r0
            r0 = 0
            r2.f24820d = r0
            r0 = 1
            r2.f24821e = r0
            r2.f24817a = r3
            r2.f24818b = r5
            r2.f24819c = r7
            return
    }

    /* renamed from: a */
    public void m13010a(android.animation.Animator r3) {
            r2 = this;
            long r0 = r2.f24817a
            r3.setStartDelay(r0)
            long r0 = r2.f24818b
            r3.setDuration(r0)
            android.animation.TimeInterpolator r0 = r2.m13011b()
            r3.setInterpolator(r0)
            boolean r0 = r3 instanceof android.animation.ValueAnimator
            if (r0 == 0) goto L21
            android.animation.ValueAnimator r3 = (android.animation.ValueAnimator) r3
            int r0 = r2.f24820d
            r3.setRepeatCount(r0)
            int r0 = r2.f24821e
            r3.setRepeatMode(r0)
        L21:
            return
    }

    /* renamed from: b */
    public android.animation.TimeInterpolator m13011b() {
            r1 = this;
            android.animation.TimeInterpolator r0 = r1.f24819c
            if (r0 == 0) goto L5
            goto L7
        L5:
            android.animation.TimeInterpolator r0 = p354u7.C6350a.f24804b
        L7:
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L4
            r7 = 1
            return r7
        L4:
            boolean r0 = r7 instanceof p354u7.C6357h
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            u7.h r7 = (p354u7.C6357h) r7
            long r2 = r6.f24817a
            long r4 = r7.f24817a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L15
            return r1
        L15:
            long r2 = r6.f24818b
            long r4 = r7.f24818b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1e
            return r1
        L1e:
            int r0 = r6.f24820d
            int r2 = r7.f24820d
            if (r0 == r2) goto L25
            return r1
        L25:
            int r0 = r6.f24821e
            int r2 = r7.f24821e
            if (r0 == r2) goto L2c
            return r1
        L2c:
            android.animation.TimeInterpolator r0 = r6.m13011b()
            java.lang.Class r0 = r0.getClass()
            android.animation.TimeInterpolator r7 = r7.m13011b()
            java.lang.Class r7 = r7.getClass()
            boolean r7 = r0.equals(r7)
            return r7
    }

    public int hashCode() {
            r7 = this;
            long r0 = r7.f24817a
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            int r1 = r1 * 31
            long r3 = r7.f24818b
            long r5 = r3 >>> r2
            long r2 = r3 ^ r5
            int r0 = (int) r2
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.animation.TimeInterpolator r0 = r7.m13011b()
            java.lang.Class r0 = r0.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r7.f24820d
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r7.f24821e
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 10
            java.lang.StringBuilder r0 = p367v1.C6487a.m13176a(r0)
            java.lang.Class<u7.h> r1 = p354u7.C6357h.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " delay: "
            r0.append(r1)
            long r1 = r3.f24817a
            r0.append(r1)
            java.lang.String r1 = " duration: "
            r0.append(r1)
            long r1 = r3.f24818b
            r0.append(r1)
            java.lang.String r1 = " interpolator: "
            r0.append(r1)
            android.animation.TimeInterpolator r1 = r3.m13011b()
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " repeatCount: "
            r0.append(r1)
            int r1 = r3.f24820d
            r0.append(r1)
            java.lang.String r1 = " repeatMode: "
            r0.append(r1)
            int r1 = r3.f24821e
            java.lang.String r2 = "}\n"
            java.lang.String r0 = p381w.C6764e.m13690a(r0, r1, r2)
            return r0
    }
}
