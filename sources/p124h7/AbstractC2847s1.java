package p124h7;

import p124h7.InterfaceC2935x;

/* renamed from: h7.s1 */
/* loaded from: classes.dex */
public abstract class AbstractC2847s1<KeyProtoT extends p124h7.InterfaceC2935x> {

    /* renamed from: a */
    public final java.lang.Class<KeyProtoT> f11902a;

    /* renamed from: b */
    public final java.util.Map<java.lang.Class<?>, p124h7.AbstractC2829r1<?, KeyProtoT>> f11903b;

    /* renamed from: c */
    public final java.lang.Class<?> f11904c;

    @java.lang.SafeVarargs
    public AbstractC2847s1(java.lang.Class<KeyProtoT> r5, com.google.android.gms.internal.firebase-auth-api.zzau<?, KeyProtoT>... r6) {
            r4 = this;
            r4.<init>()
            r4.f11902a = r5
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0 = 0
            r1 = 0
        Lc:
            if (r1 > 0) goto L42
            r2 = r6[r1]
            java.lang.Class<PrimitiveT> r3 = r2.f11874a
            boolean r3 = r5.containsKey(r3)
            if (r3 == 0) goto L3a
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Class<PrimitiveT> r6 = r2.f11874a
            java.lang.String r6 = r6.getCanonicalName()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "KeyTypeManager constructed with duplicate factories for primitive "
            int r1 = r6.length()
            if (r1 == 0) goto L31
            java.lang.String r6 = r0.concat(r6)
            goto L36
        L31:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
        L36:
            r5.<init>(r6)
            throw r5
        L3a:
            java.lang.Class<PrimitiveT> r3 = r2.f11874a
            r5.put(r3, r2)
            int r1 = r1 + 1
            goto Lc
        L42:
            r6 = r6[r0]
            java.lang.Class<PrimitiveT> r6 = r6.f11874a
            r4.f11904c = r6
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
            r4.f11903b = r5
            return
    }

    /* renamed from: a */
    public p366v0.AbstractC6484c mo6563a() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Creating keys is not supported."
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public abstract p124h7.EnumC2672i6 mo6564b();

    /* renamed from: c */
    public abstract KeyProtoT mo6565c(p124h7.AbstractC2574cg r1);

    /* renamed from: d */
    public final <P> P m7120d(KeyProtoT r4, java.lang.Class<P> r5) {
            r3 = this;
            java.util.Map<java.lang.Class<?>, h7.r1<?, KeyProtoT extends h7.x>> r0 = r3.f11903b
            java.lang.Object r0 = r0.get(r5)
            h7.r1 r0 = (p124h7.AbstractC2829r1) r0
            if (r0 == 0) goto Lf
            java.lang.Object r4 = r0.mo6522a(r4)
            return r4
        Lf:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 41
            r1.<init>(r0)
            java.lang.String r0 = "Requested primitive class "
            java.lang.String r2 = " not supported."
            java.lang.String r5 = p083f.C1932s.m4774a(r1, r0, r5, r2)
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: e */
    public abstract java.lang.String mo6566e();

    /* renamed from: f */
    public final java.util.Set<java.lang.Class<?>> m7121f() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, h7.r1<?, KeyProtoT extends h7.x>> r0 = r1.f11903b
            java.util.Set r0 = r0.keySet()
            return r0
    }

    /* renamed from: g */
    public abstract void mo6567g(KeyProtoT r1);
}
