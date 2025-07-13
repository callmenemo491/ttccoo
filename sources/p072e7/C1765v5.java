package p072e7;

import p072e7.AbstractC1783x5;
import p072e7.C1765v5;

/* renamed from: e7.v5 */
/* loaded from: classes.dex */
public class C1765v5<MessageType extends p072e7.AbstractC1783x5<MessageType, BuilderType>, BuilderType extends p072e7.C1765v5<MessageType, BuilderType>> extends p072e7.AbstractC1800z4<MessageType, BuilderType> {

    /* renamed from: Y */
    public final MessageType f7815Y;

    /* renamed from: Z */
    public MessageType f7816Z;

    /* renamed from: a0 */
    public boolean f7817a0;

    public C1765v5(MessageType r3) {
            r2 = this;
            r2.<init>()
            r2.f7815Y = r3
            r0 = 4
            r1 = 0
            java.lang.Object r3 = r3.mo4118e(r0, r1, r1)
            e7.x5 r3 = (p072e7.AbstractC1783x5) r3
            r2.f7816Z = r3
            r3 = 0
            r2.f7817a0 = r3
            return
    }

    /* renamed from: a */
    public static final void m4457a(MessageType r2, MessageType r3) {
            e7.i7 r0 = p072e7.C1640i7.f7650c
            java.lang.Class r1 = r2.getClass()
            e7.l7 r0 = r0.m4233a(r1)
            r0.mo4169f(r2, r3)
            return
    }

    /* renamed from: b */
    public final BuilderType m4458b(MessageType r2) {
            r1 = this;
            boolean r0 = r1.f7817a0
            if (r0 == 0) goto La
            r1.m4461e()
            r0 = 0
            r1.f7817a0 = r0
        La:
            MessageType extends e7.x5<MessageType, BuilderType> r0 = r1.f7816Z
            m4457a(r0, r2)
            return r1
    }

    /* renamed from: c */
    public final MessageType m4459c() {
            r6 = this;
            e7.x5 r0 = r6.m4460d()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo4118e(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            r4 = 0
            if (r3 != r1) goto L14
            goto L30
        L14:
            if (r3 != 0) goto L18
            r1 = 0
            goto L30
        L18:
            e7.i7 r3 = p072e7.C1640i7.f7650c
            java.lang.Class r5 = r0.getClass()
            e7.l7 r3 = r3.m4233a(r5)
            boolean r3 = r3.mo4166c(r0)
            if (r1 == r3) goto L2a
            r1 = r2
            goto L2b
        L2a:
            r1 = r0
        L2b:
            r5 = 2
            r0.mo4118e(r5, r1, r2)
            r1 = r3
        L30:
            if (r1 == 0) goto L33
            return r0
        L33:
            e7.y7 r0 = new e7.y7
            r0.<init>(r4)
            throw r0
    }

    public final java.lang.Object clone() {
            r3 = this;
            MessageType extends e7.x5<MessageType, BuilderType> r0 = r3.f7815Y
            r1 = 5
            r2 = 0
            java.lang.Object r0 = r0.mo4118e(r1, r2, r2)
            e7.v5 r0 = (p072e7.C1765v5) r0
            e7.x5 r1 = r3.m4460d()
            r0.m4458b(r1)
            return r0
    }

    /* renamed from: d */
    public MessageType m4460d() {
            r3 = this;
            boolean r0 = r3.f7817a0
            if (r0 == 0) goto L7
            MessageType extends e7.x5<MessageType, BuilderType> r0 = r3.f7816Z
            return r0
        L7:
            MessageType extends e7.x5<MessageType, BuilderType> r0 = r3.f7816Z
            e7.i7 r1 = p072e7.C1640i7.f7650c
            java.lang.Class r2 = r0.getClass()
            e7.l7 r1 = r1.m4233a(r2)
            r1.mo4172i(r0)
            r0 = 1
            r3.f7817a0 = r0
            MessageType extends e7.x5<MessageType, BuilderType> r0 = r3.f7816Z
            return r0
    }

    /* renamed from: e */
    public void m4461e() {
            r4 = this;
            MessageType extends e7.x5<MessageType, BuilderType> r0 = r4.f7816Z
            r1 = 4
            r2 = 0
            java.lang.Object r0 = r0.mo4118e(r1, r2, r2)
            e7.x5 r0 = (p072e7.AbstractC1783x5) r0
            MessageType extends e7.x5<MessageType, BuilderType> r1 = r4.f7816Z
            e7.i7 r2 = p072e7.C1640i7.f7650c
            java.lang.Class r3 = r0.getClass()
            e7.l7 r2 = r2.m4233a(r3)
            r2.mo4169f(r0, r1)
            r4.f7816Z = r0
            return
    }

    @Override // p072e7.InterfaceC1570b7
    /* renamed from: k */
    public final /* synthetic */ p072e7.InterfaceC1560a7 mo4130k() {
            r1 = this;
            MessageType extends e7.x5<MessageType, BuilderType> r0 = r1.f7815Y
            return r0
    }
}
