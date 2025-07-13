package p093f9;

import p221m9.InterfaceC4482q0;

/* renamed from: f9.e */
/* loaded from: classes.dex */
public class C2087e<PrimitiveT, KeyProtoT extends p221m9.InterfaceC4482q0> implements p093f9.InterfaceC2086d<PrimitiveT> {

    /* renamed from: a */
    public final p093f9.AbstractC2089g<KeyProtoT> f9504a;

    /* renamed from: b */
    public final java.lang.Class<PrimitiveT> f9505b;

    public C2087e(p093f9.AbstractC2089g<KeyProtoT> r4, java.lang.Class<PrimitiveT> r5) {
            r3 = this;
            r3.<init>()
            java.util.Map<java.lang.Class<?>, f9.g$b<?, KeyProtoT extends m9.q0>> r0 = r4.f9508b
            java.util.Set r0 = r0.keySet()
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L35
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L18
            goto L35
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r4 = r4.toString()
            r1[r2] = r4
            r4 = 1
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Given internalKeyMananger %s does not support primitive class %s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        L35:
            r3.f9504a = r4
            r3.f9505b = r5
            return
    }

    /* renamed from: a */
    public final PrimitiveT m5510a(p221m9.AbstractC4454h r4) {
            r3 = this;
            f9.g<KeyProtoT extends m9.q0> r0 = r3.f9504a     // Catch: p221m9.C4434a0 -> L26
            m9.q0 r4 = r0.mo5518e(r4)     // Catch: p221m9.C4434a0 -> L26
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            java.lang.Class<PrimitiveT> r1 = r3.f9505b     // Catch: p221m9.C4434a0 -> L26
            boolean r0 = r0.equals(r1)     // Catch: p221m9.C4434a0 -> L26
            if (r0 != 0) goto L1e
            f9.g<KeyProtoT extends m9.q0> r0 = r3.f9504a     // Catch: p221m9.C4434a0 -> L26
            r0.mo5519f(r4)     // Catch: p221m9.C4434a0 -> L26
            f9.g<KeyProtoT extends m9.q0> r0 = r3.f9504a     // Catch: p221m9.C4434a0 -> L26
            java.lang.Class<PrimitiveT> r1 = r3.f9505b     // Catch: p221m9.C4434a0 -> L26
            java.lang.Object r4 = r0.m5515b(r4, r1)     // Catch: p221m9.C4434a0 -> L26
            return r4
        L1e:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: p221m9.C4434a0 -> L26
            java.lang.String r0 = "Cannot create a primitive for Void"
            r4.<init>(r0)     // Catch: p221m9.C4434a0 -> L26
            throw r4     // Catch: p221m9.C4434a0 -> L26
        L26:
            r4 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Failures parsing proto of type "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            f9.g<KeyProtoT extends m9.q0> r2 = r3.f9504a
            java.lang.Class<KeyProtoT extends m9.q0> r2 = r2.f9507a
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    /* renamed from: b */
    public final p221m9.InterfaceC4482q0 m5511b(p221m9.AbstractC4454h r4) {
            r3 = this;
            f9.g<KeyProtoT extends m9.q0> r0 = r3.f9504a     // Catch: p221m9.C4434a0 -> L14
            f9.g$a r0 = r0.mo5516c()     // Catch: p221m9.C4434a0 -> L14
            m9.q0 r4 = r0.mo5521b(r4)     // Catch: p221m9.C4434a0 -> L14
            r0.mo5522c(r4)     // Catch: p221m9.C4434a0 -> L14
            java.lang.Object r4 = r0.mo5520a(r4)     // Catch: p221m9.C4434a0 -> L14
            m9.q0 r4 = (p221m9.InterfaceC4482q0) r4     // Catch: p221m9.C4434a0 -> L14
            return r4
        L14:
            r4 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Failures parsing proto of type "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            f9.g<KeyProtoT extends m9.q0> r2 = r3.f9504a
            f9.g$a r2 = r2.mo5516c()
            java.lang.Class<KeyFormatProtoT extends m9.q0> r2 = r2.f9510a
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    /* renamed from: c */
    public final p204l9.C4229w m5512c(p221m9.AbstractC4454h r4) {
            r3 = this;
            f9.g<KeyProtoT extends m9.q0> r0 = r3.f9504a     // Catch: p221m9.C4434a0 -> L4c
            f9.g$a r0 = r0.mo5516c()     // Catch: p221m9.C4434a0 -> L4c
            m9.q0 r4 = r0.mo5521b(r4)     // Catch: p221m9.C4434a0 -> L4c
            r0.mo5522c(r4)     // Catch: p221m9.C4434a0 -> L4c
            java.lang.Object r4 = r0.mo5520a(r4)     // Catch: p221m9.C4434a0 -> L4c
            m9.q0 r4 = (p221m9.InterfaceC4482q0) r4     // Catch: p221m9.C4434a0 -> L4c
            l9.w$b r0 = p204l9.C4229w.m9522E()     // Catch: p221m9.C4434a0 -> L4c
            f9.g<KeyProtoT extends m9.q0> r1 = r3.f9504a     // Catch: p221m9.C4434a0 -> L4c
            java.lang.String r1 = r1.mo5514a()     // Catch: p221m9.C4434a0 -> L4c
            r0.m10377o()     // Catch: p221m9.C4434a0 -> L4c
            MessageType extends m9.x<MessageType, BuilderType> r2 = r0.f18293Z     // Catch: p221m9.C4434a0 -> L4c
            l9.w r2 = (p204l9.C4229w) r2     // Catch: p221m9.C4434a0 -> L4c
            p204l9.C4229w.m9524x(r2, r1)     // Catch: p221m9.C4434a0 -> L4c
            m9.h r4 = r4.mo9890g()     // Catch: p221m9.C4434a0 -> L4c
            r0.m10377o()     // Catch: p221m9.C4434a0 -> L4c
            MessageType extends m9.x<MessageType, BuilderType> r1 = r0.f18293Z     // Catch: p221m9.C4434a0 -> L4c
            l9.w r1 = (p204l9.C4229w) r1     // Catch: p221m9.C4434a0 -> L4c
            p204l9.C4229w.m9525y(r1, r4)     // Catch: p221m9.C4434a0 -> L4c
            f9.g<KeyProtoT extends m9.q0> r4 = r3.f9504a     // Catch: p221m9.C4434a0 -> L4c
            l9.w$c r4 = r4.mo5517d()     // Catch: p221m9.C4434a0 -> L4c
            r0.m10377o()     // Catch: p221m9.C4434a0 -> L4c
            MessageType extends m9.x<MessageType, BuilderType> r1 = r0.f18293Z     // Catch: p221m9.C4434a0 -> L4c
            l9.w r1 = (p204l9.C4229w) r1     // Catch: p221m9.C4434a0 -> L4c
            p204l9.C4229w.m9526z(r1, r4)     // Catch: p221m9.C4434a0 -> L4c
            m9.x r4 = r0.m10375k()     // Catch: p221m9.C4434a0 -> L4c
            l9.w r4 = (p204l9.C4229w) r4     // Catch: p221m9.C4434a0 -> L4c
            return r4
        L4c:
            r4 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Unexpected proto"
            r0.<init>(r1, r4)
            throw r0
    }
}
