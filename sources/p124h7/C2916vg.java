package p124h7;

import p124h7.AbstractC2970yg;
import p124h7.C2916vg;

/* renamed from: h7.vg */
/* loaded from: classes.dex */
public class C2916vg<MessageType extends p124h7.AbstractC2970yg<MessageType, BuilderType>, BuilderType extends p124h7.C2916vg<MessageType, BuilderType>> extends p124h7.AbstractC2843rf<MessageType, BuilderType> {

    /* renamed from: Y */
    public final MessageType f11972Y;

    /* renamed from: Z */
    public MessageType f11973Z;

    /* renamed from: a0 */
    public boolean f11974a0;

    public C2916vg(MessageType r3) {
            r2 = this;
            r2.<init>()
            r2.f11972Y = r3
            r0 = 4
            r1 = 0
            java.lang.Object r3 = r3.mo6484h(r0, r1, r1)
            h7.yg r3 = (p124h7.AbstractC2970yg) r3
            r2.f11973Z = r3
            r3 = 0
            r2.f11974a0 = r3
            return
    }

    /* renamed from: a */
    public final BuilderType m7219a(MessageType r4) {
            r3 = this;
            boolean r0 = r3.f11974a0
            if (r0 == 0) goto La
            r3.m7222d()
            r0 = 0
            r3.f11974a0 = r0
        La:
            MessageType extends h7.yg<MessageType, BuilderType> r0 = r3.f11973Z
            h7.f0 r1 = p124h7.C2612f0.f11504c
            java.lang.Class r2 = r0.getClass()
            h7.i0 r1 = r1.m6688a(r2)
            r1.mo6438a(r0, r4)
            return r3
    }

    /* renamed from: b */
    public final MessageType m7220b() {
            r2 = this;
            h7.yg r0 = r2.m7221c()
            boolean r1 = r0.m7335f()
            if (r1 == 0) goto Lb
            return r0
        Lb:
            h7.u0 r0 = new h7.u0
            r1 = 0
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: c */
    public MessageType m7221c() {
            r3 = this;
            boolean r0 = r3.f11974a0
            if (r0 == 0) goto L7
            MessageType extends h7.yg<MessageType, BuilderType> r0 = r3.f11973Z
            return r0
        L7:
            MessageType extends h7.yg<MessageType, BuilderType> r0 = r3.f11973Z
            h7.f0 r1 = p124h7.C2612f0.f11504c
            java.lang.Class r2 = r0.getClass()
            h7.i0 r1 = r1.m6688a(r2)
            r1.mo6440c(r0)
            r0 = 1
            r3.f11974a0 = r0
            MessageType extends h7.yg<MessageType, BuilderType> r0 = r3.f11973Z
            return r0
    }

    public final java.lang.Object clone() {
            r3 = this;
            MessageType extends h7.yg<MessageType, BuilderType> r0 = r3.f11972Y
            r1 = 5
            r2 = 0
            java.lang.Object r0 = r0.mo6484h(r1, r2, r2)
            h7.vg r0 = (p124h7.C2916vg) r0
            h7.yg r1 = r3.m7221c()
            r0.m7219a(r1)
            return r0
    }

    /* renamed from: d */
    public void m7222d() {
            r4 = this;
            MessageType extends h7.yg<MessageType, BuilderType> r0 = r4.f11973Z
            r1 = 4
            r2 = 0
            java.lang.Object r0 = r0.mo6484h(r1, r2, r2)
            h7.yg r0 = (p124h7.AbstractC2970yg) r0
            MessageType extends h7.yg<MessageType, BuilderType> r1 = r4.f11973Z
            h7.f0 r2 = p124h7.C2612f0.f11504c
            java.lang.Class r3 = r0.getClass()
            h7.i0 r2 = r2.m6688a(r3)
            r2.mo6438a(r0, r1)
            r4.f11973Z = r0
            return
    }

    @Override // p124h7.InterfaceC2953y
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2935x mo7223t() {
            r1 = this;
            MessageType extends h7.yg<MessageType, BuilderType> r0 = r1.f11972Y
            return r0
    }
}
