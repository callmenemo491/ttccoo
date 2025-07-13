package p248o6;

/* renamed from: o6.d */
/* loaded from: classes.dex */
public final class C4902d {

    /* renamed from: a */
    public final android.accounts.Account f19458a;

    /* renamed from: b */
    public final java.util.Set<com.google.android.gms.common.api.Scope> f19459b;

    /* renamed from: c */
    public final java.util.Set<com.google.android.gms.common.api.Scope> f19460c;

    /* renamed from: d */
    public final java.util.Map<p201l6.C4181a<?>, p248o6.C4902d.b> f19461d;

    /* renamed from: e */
    public final java.lang.String f19462e;

    /* renamed from: f */
    public final java.lang.String f19463f;

    /* renamed from: g */
    public final p271p7.C5371a f19464g;

    /* renamed from: h */
    public java.lang.Integer f19465h;

    /* renamed from: o6.d$a */
    public static final class a {

        /* renamed from: a */
        public android.accounts.Account f19466a;

        /* renamed from: b */
        public p319s.C5936c<com.google.android.gms.common.api.Scope> f19467b;

        /* renamed from: c */
        public java.lang.String f19468c;

        /* renamed from: d */
        public java.lang.String f19469d;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.RecentlyNonNull
        /* renamed from: a */
        public final p248o6.C4902d m11064a() {
                r10 = this;
                o6.d r9 = new o6.d
                android.accounts.Account r1 = r10.f19466a
                s.c<com.google.android.gms.common.api.Scope> r2 = r10.f19467b
                java.lang.String r6 = r10.f19468c
                java.lang.String r7 = r10.f19469d
                p7.a r8 = p271p7.C5371a.f21365Y
                r3 = 0
                r4 = 0
                r5 = 0
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }
    }

    /* renamed from: o6.d$b */
    public static final class b {
    }

    public C4902d(android.accounts.Account r1, @androidx.annotation.RecentlyNonNull java.util.Set r2, @androidx.annotation.RecentlyNonNull java.util.Map r3, int r4, @androidx.annotation.RecentlyNonNull android.view.View r5, @androidx.annotation.RecentlyNonNull java.lang.String r6, @androidx.annotation.RecentlyNonNull java.lang.String r7, @androidx.annotation.RecentlyNonNull p271p7.C5371a r8) {
            r0 = this;
            r0.<init>()
            r0.f19458a = r1
            if (r2 != 0) goto Lc
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L10
        Lc:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
        L10:
            r0.f19459b = r1
            java.util.Map r2 = java.util.Collections.emptyMap()
            r0.f19461d = r2
            r0.f19462e = r6
            r0.f19463f = r7
            r0.f19464g = r8
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r1)
            java.util.Collection r1 = r2.values()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            o6.d$b r2 = (p248o6.C4902d.b) r2
            java.util.Objects.requireNonNull(r2)
            r2 = 0
            r3.addAll(r2)
            goto L2b
        L3f:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r3)
            r0.f19460c = r1
            return
    }
}
