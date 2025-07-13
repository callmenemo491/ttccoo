package com.google.android.gms.cast;

/* renamed from: com.google.android.gms.cast.a */
/* loaded from: classes.dex */
public final class C1057a {

    /* renamed from: a */
    public static final /* synthetic */ int f5403a = 0;

    /* renamed from: com.google.android.gms.cast.a$a */
    public interface a extends p201l6.InterfaceC4188h {
        @androidx.annotation.RecentlyNullable
        /* renamed from: K */
        java.lang.String mo2931K();

        @androidx.annotation.RecentlyNullable
        /* renamed from: W */
        p036c6.C0879d mo2932W();

        /* renamed from: m */
        boolean mo2933m();

        @androidx.annotation.RecentlyNullable
        /* renamed from: w */
        java.lang.String mo2934w();
    }

    /* renamed from: com.google.android.gms.cast.a$b */
    public static final class b implements p201l6.C4181a.c {

        /* renamed from: Y */
        public final com.google.android.gms.cast.CastDevice f5404Y;

        /* renamed from: Z */
        public final com.google.android.gms.cast.C1057a.c f5405Z;

        /* renamed from: a0 */
        public final android.os.Bundle f5406a0;

        /* renamed from: b0 */
        public final java.lang.String f5407b0;

        /* renamed from: com.google.android.gms.cast.a$b$a */
        public static final class a {

            /* renamed from: a */
            public com.google.android.gms.cast.CastDevice f5408a;

            /* renamed from: b */
            public com.google.android.gms.cast.C1057a.c f5409b;

            /* renamed from: c */
            public android.os.Bundle f5410c;

            public a(@androidx.annotation.RecentlyNonNull com.google.android.gms.cast.CastDevice r1, @androidx.annotation.RecentlyNonNull com.google.android.gms.cast.C1057a.c r2) {
                    r0 = this;
                    r0.<init>()
                    r0.f5408a = r1
                    r0.f5409b = r2
                    return
            }
        }

        public /* synthetic */ b(com.google.android.gms.cast.C1057a.b.a r2) {
                r1 = this;
                r1.<init>()
                com.google.android.gms.cast.CastDevice r0 = r2.f5408a
                r1.f5404Y = r0
                com.google.android.gms.cast.a$c r0 = r2.f5409b
                r1.f5405Z = r0
                android.os.Bundle r2 = r2.f5410c
                r1.f5406a0 = r2
                java.util.UUID r2 = java.util.UUID.randomUUID()
                java.lang.String r2 = r2.toString()
                r1.f5407b0 = r2
                return
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r8 != r7) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof com.google.android.gms.cast.C1057a.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.gms.cast.a$b r8 = (com.google.android.gms.cast.C1057a.b) r8
                com.google.android.gms.cast.CastDevice r1 = r7.f5404Y
                com.google.android.gms.cast.CastDevice r3 = r8.f5404Y
                boolean r1 = p248o6.C4924o.m11074a(r1, r3)
                if (r1 == 0) goto L64
                android.os.Bundle r1 = r7.f5406a0
                android.os.Bundle r3 = r8.f5406a0
                if (r1 == 0) goto L57
                if (r3 != 0) goto L1f
                goto L57
            L1f:
                int r4 = r1.size()
                int r5 = r3.size()
                if (r4 == r5) goto L2a
                goto L64
            L2a:
                java.util.Set r4 = r1.keySet()
                java.util.Set r5 = r3.keySet()
                boolean r5 = r4.containsAll(r5)
                if (r5 == 0) goto L64
                java.util.Iterator r4 = r4.iterator()
            L3c:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L59
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r1.get(r5)
                java.lang.Object r5 = r3.get(r5)
                boolean r5 = p248o6.C4924o.m11074a(r6, r5)
                if (r5 != 0) goto L3c
                goto L64
            L57:
                if (r1 != r3) goto L64
            L59:
                java.lang.String r1 = r7.f5407b0
                java.lang.String r8 = r8.f5407b0
                boolean r8 = p248o6.C4924o.m11074a(r1, r8)
                if (r8 == 0) goto L64
                return r0
            L64:
                return r2
        }

        public int hashCode() {
                r4 = this;
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.google.android.gms.cast.CastDevice r1 = r4.f5404Y
                r2 = 0
                r0[r2] = r1
                android.os.Bundle r1 = r4.f5406a0
                r3 = 1
                r0[r3] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r2 = 2
                r0[r2] = r1
                java.lang.String r1 = r4.f5407b0
                r2 = 3
                r0[r2] = r1
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }
    }

    /* renamed from: com.google.android.gms.cast.a$c */
    public static class c {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void mo2935a(int r1) {
                r0 = this;
                return
        }

        /* renamed from: b */
        public void mo2936b(int r1) {
                r0 = this;
                return
        }

        /* renamed from: c */
        public void mo2937c(p036c6.C0879d r1) {
                r0 = this;
                return
        }

        /* renamed from: d */
        public void mo2938d() {
                r0 = this;
                return
        }

        /* renamed from: e */
        public void mo2939e(int r1) {
                r0 = this;
                return
        }

        /* renamed from: f */
        public void mo2940f() {
                r0 = this;
                return
        }
    }

    /* renamed from: com.google.android.gms.cast.a$d */
    public interface d {
        /* renamed from: a */
        void mo2941a(@androidx.annotation.RecentlyNonNull com.google.android.gms.cast.CastDevice r1, @androidx.annotation.RecentlyNonNull java.lang.String r2, @androidx.annotation.RecentlyNonNull java.lang.String r3);
    }

    static {
            l6.a$f<h6.d0> r0 = p123h6.C2502i.f11296a
            return
    }
}
