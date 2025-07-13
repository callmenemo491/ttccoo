package p026b9;

/* renamed from: b9.j */
/* loaded from: classes.dex */
public abstract class AbstractC0706j {

    /* renamed from: a */
    public static final p026b9.AbstractC0706j f3964a = null;

    /* renamed from: b */
    public static final p026b9.AbstractC0706j f3965b = null;

    /* renamed from: c */
    public static final p026b9.AbstractC0706j f3966c = null;

    /* renamed from: b9.j$a */
    public static class a extends p026b9.AbstractC0706j {
        public a() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // p026b9.AbstractC0706j
        /* renamed from: a */
        public p026b9.AbstractC0706j mo2291a(int r1, int r2) {
                r0 = this;
                if (r1 >= r2) goto L4
                r1 = -1
                goto L9
            L4:
                if (r1 <= r2) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                b9.j r1 = r0.m2297g(r1)
                return r1
        }

        @Override // p026b9.AbstractC0706j
        /* renamed from: b */
        public p026b9.AbstractC0706j mo2292b(long r2, long r4) {
                r1 = this;
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 >= 0) goto L6
                r2 = -1
                goto Lb
            L6:
                if (r0 <= 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                b9.j r2 = r1.m2297g(r2)
                return r2
        }

        @Override // p026b9.AbstractC0706j
        /* renamed from: c */
        public <T> p026b9.AbstractC0706j mo2293c(T r1, T r2, java.util.Comparator<T> r3) {
                r0 = this;
                int r1 = r3.compare(r1, r2)
                b9.j r1 = r0.m2297g(r1)
                return r1
        }

        @Override // p026b9.AbstractC0706j
        /* renamed from: d */
        public p026b9.AbstractC0706j mo2294d(boolean r1, boolean r2) {
                r0 = this;
                if (r1 != r2) goto L4
                r1 = 0
                goto L9
            L4:
                if (r1 == 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = -1
            L9:
                b9.j r1 = r0.m2297g(r1)
                return r1
        }

        @Override // p026b9.AbstractC0706j
        /* renamed from: e */
        public p026b9.AbstractC0706j mo2295e(boolean r1, boolean r2) {
                r0 = this;
                if (r2 != r1) goto L4
                r1 = 0
                goto L9
            L4:
                if (r2 == 0) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = -1
            L9:
                b9.j r1 = r0.m2297g(r1)
                return r1
        }

        @Override // p026b9.AbstractC0706j
        /* renamed from: f */
        public int mo2296f() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: g */
        public p026b9.AbstractC0706j m2297g(int r1) {
                r0 = this;
                if (r1 >= 0) goto L5
                b9.j r1 = p026b9.AbstractC0706j.f3965b
                goto Lc
            L5:
                if (r1 <= 0) goto La
                b9.j r1 = p026b9.AbstractC0706j.f3966c
                goto Lc
            La:
                b9.j r1 = p026b9.AbstractC0706j.f3964a
            Lc:
                return r1
        }
    }

    /* renamed from: b9.j$b */
    public static final class b extends p026b9.AbstractC0706j {

        /* renamed from: d */
        public final int f3967d;

        public b(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f3967d = r2
                return
        }

        @Override // p026b9.AbstractC0706j
        /* renamed from: a */
        public p026b9.AbstractC0706j mo2291a(int r1, int r2) {
                r0 = this;
                return r0
        }

        @Override // p026b9.AbstractC0706j
        /* renamed from: b */
        public p026b9.AbstractC0706j mo2292b(long r1, long r3) {
                r0 = this;
                return r0
        }

        @Override // p026b9.AbstractC0706j
        /* renamed from: c */
        public <T> p026b9.AbstractC0706j mo2293c(T r1, T r2, java.util.Comparator<T> r3) {
                r0 = this;
                return r0
        }

        @Override // p026b9.AbstractC0706j
        /* renamed from: d */
        public p026b9.AbstractC0706j mo2294d(boolean r1, boolean r2) {
                r0 = this;
                return r0
        }

        @Override // p026b9.AbstractC0706j
        /* renamed from: e */
        public p026b9.AbstractC0706j mo2295e(boolean r1, boolean r2) {
                r0 = this;
                return r0
        }

        @Override // p026b9.AbstractC0706j
        /* renamed from: f */
        public int mo2296f() {
                r1 = this;
                int r0 = r1.f3967d
                return r0
        }
    }

    static {
            b9.j$a r0 = new b9.j$a
            r0.<init>()
            p026b9.AbstractC0706j.f3964a = r0
            b9.j$b r0 = new b9.j$b
            r1 = -1
            r0.<init>(r1)
            p026b9.AbstractC0706j.f3965b = r0
            b9.j$b r0 = new b9.j$b
            r1 = 1
            r0.<init>(r1)
            p026b9.AbstractC0706j.f3966c = r0
            return
    }

    public AbstractC0706j(p026b9.AbstractC0706j.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract p026b9.AbstractC0706j mo2291a(int r1, int r2);

    /* renamed from: b */
    public abstract p026b9.AbstractC0706j mo2292b(long r1, long r3);

    /* renamed from: c */
    public abstract <T> p026b9.AbstractC0706j mo2293c(T r1, T r2, java.util.Comparator<T> r3);

    /* renamed from: d */
    public abstract p026b9.AbstractC0706j mo2294d(boolean r1, boolean r2);

    /* renamed from: e */
    public abstract p026b9.AbstractC0706j mo2295e(boolean r1, boolean r2);

    /* renamed from: f */
    public abstract int mo2296f();
}
