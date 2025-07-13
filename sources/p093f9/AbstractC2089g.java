package p093f9;

import p221m9.InterfaceC4482q0;

/* renamed from: f9.g */
/* loaded from: classes.dex */
public abstract class AbstractC2089g<KeyProtoT extends p221m9.InterfaceC4482q0> {

    /* renamed from: a */
    public final java.lang.Class<KeyProtoT> f9507a;

    /* renamed from: b */
    public final java.util.Map<java.lang.Class<?>, p093f9.AbstractC2089g.b<?, KeyProtoT>> f9508b;

    /* renamed from: c */
    public final java.lang.Class<?> f9509c;

    /* renamed from: f9.g$a */
    public static abstract class a<KeyFormatProtoT extends p221m9.InterfaceC4482q0, KeyT> {

        /* renamed from: a */
        public final java.lang.Class<KeyFormatProtoT> f9510a;

        public a(java.lang.Class<KeyFormatProtoT> r1) {
                r0 = this;
                r0.<init>()
                r0.f9510a = r1
                return
        }

        /* renamed from: a */
        public abstract KeyT mo5520a(KeyFormatProtoT r1);

        /* renamed from: b */
        public abstract KeyFormatProtoT mo5521b(p221m9.AbstractC4454h r1);

        /* renamed from: c */
        public abstract void mo5522c(KeyFormatProtoT r1);
    }

    /* renamed from: f9.g$b */
    public static abstract class b<PrimitiveT, KeyT> {

        /* renamed from: a */
        public final java.lang.Class<PrimitiveT> f9511a;

        public b(java.lang.Class<PrimitiveT> r1) {
                r0 = this;
                r0.<init>()
                r0.f9511a = r1
                return
        }

        /* renamed from: a */
        public abstract PrimitiveT mo5523a(KeyT r1);
    }

    @java.lang.SafeVarargs
    public AbstractC2089g(java.lang.Class<KeyProtoT> r6, com.google.crypto.tink.KeyTypeManager.PrimitiveFactory<?, KeyProtoT>... r7) {
            r5 = this;
            r5.<init>()
            r5.f9507a = r6
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            int r0 = r7.length
            r1 = 0
            r2 = 0
        Ld:
            if (r2 >= r0) goto L3a
            r3 = r7[r2]
            java.lang.Class<PrimitiveT> r4 = r3.f9511a
            boolean r4 = r6.containsKey(r4)
            if (r4 != 0) goto L21
            java.lang.Class<PrimitiveT> r4 = r3.f9511a
            r6.put(r4, r3)
            int r2 = r2 + 1
            goto Ld
        L21:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "KeyTypeManager constructed with duplicate factories for primitive "
            java.lang.StringBuilder r7 = android.support.v4.media.C0144c.m256a(r7)
            java.lang.Class<PrimitiveT> r0 = r3.f9511a
            java.lang.String r0 = r0.getCanonicalName()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L3a:
            int r0 = r7.length
            if (r0 <= 0) goto L42
            r7 = r7[r1]
            java.lang.Class<PrimitiveT> r7 = r7.f9511a
            goto L44
        L42:
            java.lang.Class<java.lang.Void> r7 = java.lang.Void.class
        L44:
            r5.f9509c = r7
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            r5.f9508b = r6
            return
    }

    /* renamed from: a */
    public abstract java.lang.String mo5514a();

    /* renamed from: b */
    public final <P> P m5515b(KeyProtoT r2, java.lang.Class<P> r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, f9.g$b<?, KeyProtoT extends m9.q0>> r0 = r1.f9508b
            java.lang.Object r0 = r0.get(r3)
            f9.g$b r0 = (p093f9.AbstractC2089g.b) r0
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r0.mo5523a(r2)
            return r2
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Requested primitive class "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r3 = r3.getCanonicalName()
            r0.append(r3)
            java.lang.String r3 = " not supported."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: c */
    public abstract p093f9.AbstractC2089g.a<?, KeyProtoT> mo5516c();

    /* renamed from: d */
    public abstract p204l9.C4229w.c mo5517d();

    /* renamed from: e */
    public abstract KeyProtoT mo5518e(p221m9.AbstractC4454h r1);

    /* renamed from: f */
    public abstract void mo5519f(KeyProtoT r1);
}
