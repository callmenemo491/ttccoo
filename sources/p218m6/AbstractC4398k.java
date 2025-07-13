package p218m6;

/* renamed from: m6.k */
/* loaded from: classes.dex */
public abstract class AbstractC4398k<A, ResultT> {

    /* renamed from: a */
    public final p184k6.C3701d[] f17958a;

    /* renamed from: b */
    public final boolean f17959b;

    /* renamed from: c */
    public final int f17960c;

    /* renamed from: m6.k$a */
    public static class a<A, ResultT> {

        /* renamed from: a */
        public p218m6.InterfaceC4396i<A, p327s7.C5986j<ResultT>> f17961a;

        /* renamed from: b */
        public boolean f17962b;

        /* renamed from: c */
        public p184k6.C3701d[] f17963c;

        /* renamed from: d */
        public int f17964d;

        public a(p052d6.C1310h0 r1) {
                r0 = this;
                r0.<init>()
                r1 = 1
                r0.f17962b = r1
                r1 = 0
                r0.f17964d = r1
                return
        }

        @androidx.annotation.RecentlyNonNull
        /* renamed from: a */
        public p218m6.AbstractC4398k<A, ResultT> m9835a() {
                r4 = this;
                m6.i<A, s7.j<ResultT>> r0 = r4.f17961a
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "execute parameter required"
                com.google.android.gms.common.internal.C1101a.m3097b(r0, r1)
                m6.v r0 = new m6.v
                k6.d[] r1 = r4.f17963c
                boolean r2 = r4.f17962b
                int r3 = r4.f17964d
                r0.<init>(r4, r1, r2, r3)
                return r0
        }
    }

    public AbstractC4398k(@androidx.annotation.RecentlyNonNull p184k6.C3701d[] r1, boolean r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f17958a = r1
            if (r1 == 0) goto Lb
            if (r2 == 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.f17959b = r1
            r0.f17960c = r3
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public static <A, ResultT> p218m6.AbstractC4398k.a<A, ResultT> m9834a() {
            m6.k$a r0 = new m6.k$a
            r1 = 0
            r0.<init>(r1)
            return r0
    }
}
