package com.google.android.gms.cast.framework.media;

/* renamed from: com.google.android.gms.cast.framework.media.a */
/* loaded from: classes.dex */
public class C1064a {

    /* renamed from: a */
    public final p123h6.C2489b f5474a;

    /* renamed from: b */
    public long f5475b;

    /* renamed from: c */
    public final com.google.android.gms.cast.framework.media.C1065b f5476c;

    /* renamed from: d */
    public java.util.List<java.lang.Integer> f5477d;

    /* renamed from: e */
    public final android.util.SparseIntArray f5478e;

    /* renamed from: f */
    public android.util.LruCache<java.lang.Integer, p036c6.C0899n> f5479f;

    /* renamed from: g */
    public final java.util.List<java.lang.Integer> f5480g;

    /* renamed from: h */
    public final java.util.Deque<java.lang.Integer> f5481h;

    /* renamed from: i */
    public final android.os.Handler f5482i;

    /* renamed from: j */
    public java.util.TimerTask f5483j;

    /* renamed from: k */
    public p201l6.AbstractC4185e<com.google.android.gms.cast.framework.media.C1065b.c> f5484k;

    /* renamed from: l */
    public p201l6.AbstractC4185e<com.google.android.gms.cast.framework.media.C1065b.c> f5485l;

    /* renamed from: m */
    public java.util.Set<com.google.android.gms.cast.framework.media.C1064a.a> f5486m;

    /* renamed from: com.google.android.gms.cast.framework.media.a$a */
    public static abstract class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public C1064a(com.google.android.gms.cast.framework.media.C1065b r3, int r4) {
            r2 = this;
            r2.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r2.f5486m = r4
            h6.b r4 = new h6.b
            java.lang.String r0 = "MediaQueue"
            r4.<init>(r0)
            r2.f5474a = r4
            r2.f5476c = r3
            r4 = 20
            r0 = 1
            java.lang.Math.max(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5477d = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r2.f5478e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5480g = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>(r4)
            r2.f5481h = r0
            e7.k r0 = new e7.k
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f5482i = r0
            e6.c0 r0 = new e6.c0
            r0.<init>(r2)
            r2.f5483j = r0
            com.google.android.gms.cast.framework.media.k r0 = new com.google.android.gms.cast.framework.media.k
            r0.<init>(r2)
            java.lang.String r1 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r1)
            java.util.List<com.google.android.gms.cast.framework.media.b$a> r3 = r3.f5495h
            r3.add(r0)
            e6.d0 r3 = new e6.d0
            r3.<init>(r2, r4)
            r2.f5479f = r3
            long r3 = r2.m2989e()
            r2.f5475b = r3
            r2.m2988d()
            return
    }

    /* renamed from: a */
    public static void m2985a(com.google.android.gms.cast.framework.media.C1064a r0, int[] r1) {
            java.util.Set<com.google.android.gms.cast.framework.media.a$a> r0 = r0.f5486m
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.cast.framework.media.a$a r1 = (com.google.android.gms.cast.framework.media.C1064a.a) r1
            java.util.Objects.requireNonNull(r1)
            goto L6
        L16:
            return
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m2986b(com.google.android.gms.cast.framework.media.C1064a r3) {
            android.util.SparseIntArray r0 = r3.f5478e
            r0.clear()
            r0 = 0
        L6:
            java.util.List<java.lang.Integer> r1 = r3.f5477d
            int r1 = r1.size()
            if (r0 >= r1) goto L22
            java.util.List<java.lang.Integer> r1 = r3.f5477d
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.util.SparseIntArray r2 = r3.f5478e
            r2.put(r1, r0)
            int r0 = r0 + 1
            goto L6
        L22:
            return
    }

    /* renamed from: c */
    public final void m2987c() {
            r2 = this;
            r2.m2992h()
            java.util.List<java.lang.Integer> r0 = r2.f5477d
            r0.clear()
            android.util.SparseIntArray r0 = r2.f5478e
            r0.clear()
            android.util.LruCache<java.lang.Integer, c6.n> r0 = r2.f5479f
            r0.evictAll()
            java.util.List<java.lang.Integer> r0 = r2.f5480g
            r0.clear()
            android.os.Handler r0 = r2.f5482i
            java.util.TimerTask r1 = r2.f5483j
            r0.removeCallbacks(r1)
            java.util.Deque<java.lang.Integer> r0 = r2.f5481h
            r0.clear()
            l6.e<com.google.android.gms.cast.framework.media.b$c> r0 = r2.f5485l
            r1 = 0
            if (r0 == 0) goto L2d
            r0.mo3043a()
            r2.f5485l = r1
        L2d:
            l6.e<com.google.android.gms.cast.framework.media.b$c> r0 = r2.f5484k
            if (r0 == 0) goto L36
            r0.mo3043a()
            r2.f5484k = r1
        L36:
            r2.m2991g()
            r2.m2990f()
            return
    }

    /* renamed from: d */
    public final void m2988d() {
            r6 = this;
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            long r1 = r6.f5475b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Le
            return
        Le:
            l6.e<com.google.android.gms.cast.framework.media.b$c> r1 = r6.f5485l
            if (r1 == 0) goto L13
            return
        L13:
            r2 = 0
            if (r1 == 0) goto L1b
            r1.mo3043a()
            r6.f5485l = r2
        L1b:
            l6.e<com.google.android.gms.cast.framework.media.b$c> r1 = r6.f5484k
            if (r1 == 0) goto L24
            r1.mo3043a()
            r6.f5484k = r2
        L24:
            com.google.android.gms.cast.framework.media.b r1 = r6.f5476c
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            boolean r0 = r1.m3016x()
            if (r0 != 0) goto L39
            r0 = 17
            l6.e r0 = com.google.android.gms.cast.framework.media.C1065b.m2993s(r0, r2)
            goto L42
        L39:
            e6.h r0 = new e6.h
            r2 = 1
            r0.<init>(r1, r2)
            com.google.android.gms.cast.framework.media.C1065b.m2994y(r0)
        L42:
            r6.f5485l = r0
            e6.b0 r1 = new e6.b0
            r2 = 0
            r1.<init>(r6, r2)
            r0.mo3044b(r1)
            return
    }

    /* renamed from: e */
    public final long m2989e() {
            r5 = this;
            com.google.android.gms.cast.framework.media.b r0 = r5.f5476c
            c6.p r0 = r0.m2998e()
            if (r0 == 0) goto L20
            com.google.android.gms.cast.MediaInfo r1 = r0.f4824Y
            if (r1 != 0) goto Le
            r1 = -1
            goto L10
        Le:
            int r1 = r1.f5374Z
        L10:
            int r2 = r0.f4828c0
            int r3 = r0.f4829d0
            int r4 = r0.f4835j0
            boolean r1 = p036c6.C0903p.m2608a0(r2, r3, r4, r1)
            if (r1 == 0) goto L1d
            goto L20
        L1d:
            long r0 = r0.f4825Z
            return r0
        L20:
            r0 = 0
            return r0
    }

    /* renamed from: f */
    public final void m2990f() {
            r2 = this;
            java.util.Set<com.google.android.gms.cast.framework.media.a$a> r0 = r2.f5486m
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.cast.framework.media.a$a r1 = (com.google.android.gms.cast.framework.media.C1064a.a) r1
            java.util.Objects.requireNonNull(r1)
            goto L6
        L16:
            return
    }

    /* renamed from: g */
    public final void m2991g() {
            r2 = this;
            java.util.Set<com.google.android.gms.cast.framework.media.a$a> r0 = r2.f5486m
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.cast.framework.media.a$a r1 = (com.google.android.gms.cast.framework.media.C1064a.a) r1
            java.util.Objects.requireNonNull(r1)
            goto L6
        L16:
            return
    }

    /* renamed from: h */
    public final void m2992h() {
            r2 = this;
            java.util.Set<com.google.android.gms.cast.framework.media.a$a> r0 = r2.f5486m
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.cast.framework.media.a$a r1 = (com.google.android.gms.cast.framework.media.C1064a.a) r1
            java.util.Objects.requireNonNull(r1)
            goto L6
        L16:
            return
    }
}
