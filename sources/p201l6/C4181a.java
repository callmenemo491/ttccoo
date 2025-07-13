package p201l6;

import p201l6.C4181a.c;

/* renamed from: l6.a */
/* loaded from: classes.dex */
public final class C4181a<O extends p201l6.C4181a.c> {

    /* renamed from: a */
    public final p201l6.C4181a.a<?, O> f17342a;

    /* renamed from: b */
    public final java.lang.String f17343b;

    /* renamed from: l6.a$a */
    public static abstract class a<T extends p201l6.C4181a.e, O> extends p201l6.C4181a.d<T, O> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.RecentlyNonNull
        @java.lang.Deprecated
        /* renamed from: a */
        public T mo2942a(@androidx.annotation.RecentlyNonNull android.content.Context r1, @androidx.annotation.RecentlyNonNull android.os.Looper r2, @androidx.annotation.RecentlyNonNull p248o6.C4902d r3, @androidx.annotation.RecentlyNonNull O r4, @androidx.annotation.RecentlyNonNull p201l6.AbstractC4184d.a r5, @androidx.annotation.RecentlyNonNull p201l6.AbstractC4184d.b r6) {
                r0 = this;
                l6.a$e r1 = r0.mo7239b(r1, r2, r3, r4, r5, r6)
                return r1
        }

        @androidx.annotation.RecentlyNonNull
        /* renamed from: b */
        public T mo7239b(@androidx.annotation.RecentlyNonNull android.content.Context r1, @androidx.annotation.RecentlyNonNull android.os.Looper r2, @androidx.annotation.RecentlyNonNull p248o6.C4902d r3, @androidx.annotation.RecentlyNonNull O r4, @androidx.annotation.RecentlyNonNull p218m6.InterfaceC4391d r5, @androidx.annotation.RecentlyNonNull p218m6.InterfaceC4395h r6) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "buildClient must be implemented"
                r1.<init>(r2)
                throw r1
        }
    }

    /* renamed from: l6.a$b */
    public static class b<C> {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: l6.a$c */
    public interface c {

        /* renamed from: P */
        @androidx.annotation.RecentlyNonNull
        public static final p201l6.C4181a.c.C7401c f17344P = null;

        /* renamed from: l6.a$c$a */
        public interface a extends p201l6.C4181a.c {
            @androidx.annotation.RecentlyNonNull
            /* renamed from: a */
            android.accounts.Account m9312a();
        }

        /* renamed from: l6.a$c$b */
        public interface b extends p201l6.C4181a.c {
            @androidx.annotation.RecentlyNullable
            /* renamed from: b */
            com.google.android.gms.auth.api.signin.GoogleSignInAccount m9313b();
        }

        /* renamed from: l6.a$c$c, reason: collision with other inner class name */
        public static final class C7401c implements p201l6.C4181a.c {
            public C7401c() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public C7401c(p052d6.C1310h0 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                l6.a$c$c r0 = new l6.a$c$c
                r1 = 0
                r0.<init>(r1)
                p201l6.C4181a.c.f17344P = r0
                return
        }
    }

    /* renamed from: l6.a$d */
    public static abstract class d<T, O> {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: l6.a$e */
    public interface e {
        /* renamed from: a */
        boolean mo9314a();

        /* renamed from: b */
        java.util.Set<com.google.android.gms.common.api.Scope> mo9315b();

        /* renamed from: c */
        void mo9316c(p248o6.InterfaceC4916k r1, java.util.Set<com.google.android.gms.common.api.Scope> r2);

        /* renamed from: d */
        void mo9317d(@androidx.annotation.RecentlyNonNull java.lang.String r1);

        /* renamed from: f */
        boolean mo6802f();

        /* renamed from: g */
        void mo9318g(@androidx.annotation.RecentlyNonNull p248o6.AbstractC4900c.e r1);

        /* renamed from: h */
        int mo2636h();

        /* renamed from: i */
        boolean mo9319i();

        @androidx.annotation.RecentlyNonNull
        /* renamed from: k */
        p184k6.C3701d[] mo9320k();

        @androidx.annotation.RecentlyNonNull
        /* renamed from: l */
        java.lang.String mo9321l();

        @androidx.annotation.RecentlyNullable
        /* renamed from: m */
        java.lang.String mo9322m();

        /* renamed from: n */
        void mo6389n();

        /* renamed from: o */
        boolean mo9323o();

        /* renamed from: q */
        void mo9324q(@androidx.annotation.RecentlyNonNull p248o6.AbstractC4900c.c r1);
    }

    /* renamed from: l6.a$f */
    public static final class f<C extends p201l6.C4181a.e> extends p201l6.C4181a.b<C> {
        public f() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public <C extends p201l6.C4181a.e> C4181a(@androidx.annotation.RecentlyNonNull java.lang.String r1, @androidx.annotation.RecentlyNonNull p201l6.C4181a.a<C, O> r2, @androidx.annotation.RecentlyNonNull p201l6.C4181a.f<C> r3) {
            r0 = this;
            r0.<init>()
            r0.f17343b = r1
            r0.f17342a = r2
            return
    }
}
