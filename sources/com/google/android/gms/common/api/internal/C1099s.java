package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.s */
/* loaded from: classes.dex */
public final class C1099s extends com.google.android.gms.common.api.internal.AbstractC1095o<java.lang.Boolean> {

    /* renamed from: c */
    public final com.google.android.gms.common.api.internal.C1083c.a<?> f5627c;

    public C1099s(com.google.android.gms.common.api.internal.C1083c.a<?> r2, p327s7.C5986j<java.lang.Boolean> r3) {
            r1 = this;
            r0 = 4
            r1.<init>(r0, r3)
            r1.f5627c = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1087g
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo3090e(p218m6.C4413z r1, boolean r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1097q
    /* renamed from: f */
    public final com.google.android.gms.common.Feature[] mo3094f(com.google.android.gms.common.api.internal.C1082b.a<?> r2) {
            r1 = this;
            java.util.Map<com.google.android.gms.common.api.internal.c$a<?>, m6.q> r2 = r2.f5580f
            com.google.android.gms.common.api.internal.c$a<?> r0 = r1.f5627c
            java.lang.Object r2 = r2.get(r0)
            m6.q r2 = (p218m6.C4404q) r2
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            com.google.android.gms.common.api.internal.d<java.lang.Object, ?> r2 = r2.f17973a
            k6.d[] r2 = r2.f5602b
            return r2
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1097q
    /* renamed from: g */
    public final boolean mo3095g(com.google.android.gms.common.api.internal.C1082b.a<?> r2) {
            r1 = this;
            java.util.Map<com.google.android.gms.common.api.internal.c$a<?>, m6.q> r2 = r2.f5580f
            com.google.android.gms.common.api.internal.c$a<?> r0 = r1.f5627c
            java.lang.Object r2 = r2.get(r0)
            m6.q r2 = (p218m6.C4404q) r2
            if (r2 == 0) goto L14
            com.google.android.gms.common.api.internal.d<java.lang.Object, ?> r2 = r2.f17973a
            boolean r2 = r2.f5603c
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1095o
    /* renamed from: h */
    public final void mo3093h(com.google.android.gms.common.api.internal.C1082b.a<?> r4) {
            r3 = this;
            java.util.Map<com.google.android.gms.common.api.internal.c$a<?>, m6.q> r0 = r4.f5580f
            com.google.android.gms.common.api.internal.c$a<?> r1 = r3.f5627c
            java.lang.Object r0 = r0.remove(r1)
            m6.q r0 = (p218m6.C4404q) r0
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.f<java.lang.Object, ?> r1 = r0.f17974b
            l6.a$e r4 = r4.f5576b
            s7.j<T> r2 = r3.f5624b
            com.google.android.gms.common.api.internal.p r1 = (com.google.android.gms.common.api.internal.C1096p) r1
            com.google.android.gms.common.api.internal.e r1 = r1.f5625b
            m6.i<A, s7.j<java.lang.Boolean>> r1 = r1.f5606b
            r1.mo813c(r4, r2)
            com.google.android.gms.common.api.internal.d<java.lang.Object, ?> r4 = r0.f17973a
            com.google.android.gms.common.api.internal.c<L> r4 = r4.f5601a
            r0 = 0
            r4.f5596a = r0
            r4.f5597b = r0
            return
        L25:
            s7.j<T> r4 = r3.f5624b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.m12459b(r0)
            return
    }
}
