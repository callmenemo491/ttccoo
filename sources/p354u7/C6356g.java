package p354u7;

/* renamed from: u7.g */
/* loaded from: classes.dex */
public class C6356g {

    /* renamed from: a */
    public final p319s.C5941h<java.lang.String, p354u7.C6357h> f24815a;

    /* renamed from: b */
    public final p319s.C5941h<java.lang.String, android.animation.PropertyValuesHolder[]> f24816b;

    public C6356g() {
            r1 = this;
            r1.<init>()
            s.h r0 = new s.h
            r0.<init>()
            r1.f24815a = r0
            s.h r0 = new s.h
            r0.<init>()
            r1.f24816b = r0
            return
    }

    /* renamed from: a */
    public static p354u7.C6356g m13006a(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L12
            r0 = 0
            int r2 = r2.getResourceId(r3, r0)
            if (r2 == 0) goto L12
            u7.g r1 = m13007b(r1, r2)
            return r1
        L12:
            r1 = 0
            return r1
    }

    /* renamed from: b */
    public static p354u7.C6356g m13007b(android.content.Context r2, int r3) {
            r0 = 0
            android.animation.Animator r2 = android.animation.AnimatorInflater.loadAnimator(r2, r3)     // Catch: java.lang.Exception -> L24
            boolean r1 = r2 instanceof android.animation.AnimatorSet     // Catch: java.lang.Exception -> L24
            if (r1 == 0) goto L14
            android.animation.AnimatorSet r2 = (android.animation.AnimatorSet) r2     // Catch: java.lang.Exception -> L24
            java.util.ArrayList r2 = r2.getChildAnimations()     // Catch: java.lang.Exception -> L24
            u7.g r2 = m13008c(r2)     // Catch: java.lang.Exception -> L24
            return r2
        L14:
            if (r2 == 0) goto L23
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L24
            r1.<init>()     // Catch: java.lang.Exception -> L24
            r1.add(r2)     // Catch: java.lang.Exception -> L24
            u7.g r2 = m13008c(r1)     // Catch: java.lang.Exception -> L24
            return r2
        L23:
            return r0
        L24:
            r2 = move-exception
            java.lang.String r1 = "Can't load animation resource ID #0x"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "MotionSpec"
            android.util.Log.w(r1, r3, r2)
            return r0
    }

    /* renamed from: c */
    public static p354u7.C6356g m13008c(java.util.List<android.animation.Animator> r12) {
            u7.g r0 = new u7.g
            r0.<init>()
            int r1 = r12.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L7e
            java.lang.Object r3 = r12.get(r2)
            android.animation.Animator r3 = (android.animation.Animator) r3
            boolean r4 = r3 instanceof android.animation.ObjectAnimator
            if (r4 == 0) goto L67
            android.animation.ObjectAnimator r3 = (android.animation.ObjectAnimator) r3
            java.lang.String r4 = r3.getPropertyName()
            android.animation.PropertyValuesHolder[] r5 = r3.getValues()
            s.h<java.lang.String, android.animation.PropertyValuesHolder[]> r6 = r0.f24816b
            r6.put(r4, r5)
            java.lang.String r4 = r3.getPropertyName()
            u7.h r11 = new u7.h
            long r6 = r3.getStartDelay()
            long r8 = r3.getDuration()
            android.animation.TimeInterpolator r5 = r3.getInterpolator()
            boolean r10 = r5 instanceof android.view.animation.AccelerateDecelerateInterpolator
            if (r10 != 0) goto L4c
            if (r5 != 0) goto L3e
            goto L4c
        L3e:
            boolean r10 = r5 instanceof android.view.animation.AccelerateInterpolator
            if (r10 == 0) goto L45
            android.animation.TimeInterpolator r5 = p354u7.C6350a.f24805c
            goto L4e
        L45:
            boolean r10 = r5 instanceof android.view.animation.DecelerateInterpolator
            if (r10 == 0) goto L4e
            android.animation.TimeInterpolator r5 = p354u7.C6350a.f24806d
            goto L4e
        L4c:
            android.animation.TimeInterpolator r5 = p354u7.C6350a.f24804b
        L4e:
            r10 = r5
            r5 = r11
            r5.<init>(r6, r8, r10)
            int r5 = r3.getRepeatCount()
            r11.f24820d = r5
            int r3 = r3.getRepeatMode()
            r11.f24821e = r3
            s.h<java.lang.String, u7.h> r3 = r0.f24815a
            r3.put(r4, r11)
            int r2 = r2 + 1
            goto La
        L67:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Animator must be an ObjectAnimator: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L7e:
            return r0
    }

    /* renamed from: d */
    public p354u7.C6357h m13009d(java.lang.String r3) {
            r2 = this;
            s.h<java.lang.String, u7.h> r0 = r2.f24815a
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r3, r1)
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L17
            s.h<java.lang.String, u7.h> r0 = r2.f24815a
            java.lang.Object r3 = r0.getOrDefault(r3, r1)
            u7.h r3 = (p354u7.C6357h) r3
            return r3
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p354u7.C6356g
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            u7.g r2 = (p354u7.C6356g) r2
            s.h<java.lang.String, u7.h> r0 = r1.f24815a
            s.h<java.lang.String, u7.h> r2 = r2.f24815a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            s.h<java.lang.String, u7.h> r0 = r1.f24815a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = 10
            java.lang.StringBuilder r0 = p367v1.C6487a.m13176a(r0)
            java.lang.Class<u7.g> r1 = p354u7.C6356g.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " timings: "
            r0.append(r1)
            s.h<java.lang.String, u7.h> r1 = r2.f24815a
            r0.append(r1)
            java.lang.String r1 = "}\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
