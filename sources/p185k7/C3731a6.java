package p185k7;

import p185k7.AbstractC3773d6;
import p185k7.C3731a6;

/* renamed from: k7.a6 */
/* loaded from: classes.dex */
public class C3731a6<MessageType extends p185k7.AbstractC3773d6<MessageType, BuilderType>, BuilderType extends p185k7.C3731a6<MessageType, BuilderType>> extends p185k7.AbstractC4051y4<MessageType, BuilderType> {

    /* renamed from: Y */
    public final MessageType f16452Y;

    /* renamed from: Z */
    public MessageType f16453Z;

    /* renamed from: a0 */
    public boolean f16454a0;

    public C3731a6(MessageType r3) {
            r2 = this;
            r2.<init>()
            r2.f16452Y = r3
            r0 = 4
            r1 = 0
            java.lang.Object r3 = r3.mo8189r(r0, r1, r1)
            k7.d6 r3 = (p185k7.AbstractC3773d6) r3
            r2.f16453Z = r3
            r3 = 0
            r2.f16454a0 = r3
            return
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            k7.a6 r0 = r1.m8204k()
            return r0
    }

    @Override // p185k7.InterfaceC3816g7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ p185k7.InterfaceC3802f7 mo8200d() {
            r1 = this;
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r1.f16452Y
            return r0
    }

    /* renamed from: f */
    public final MessageType m8201f() {
            r5 = this;
            k7.d6 r0 = r5.m8202g()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo8189r(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L2f
        L13:
            if (r3 != 0) goto L17
            r1 = 0
            goto L2f
        L17:
            k7.n7 r3 = p185k7.C3911n7.f16770c
            java.lang.Class r4 = r0.getClass()
            k7.q7 r3 = r3.m8848a(r4)
            boolean r3 = r3.mo8687f(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.mo8189r(r4, r1, r2)
            r1 = r3
        L2f:
            if (r1 == 0) goto L32
            return r0
        L32:
            k7.b8 r0 = new k7.b8
            r0.<init>()
            throw r0
    }

    /* renamed from: g */
    public MessageType m8202g() {
            r3 = this;
            boolean r0 = r3.f16454a0
            if (r0 == 0) goto L7
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r3.f16453Z
            return r0
        L7:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r3.f16453Z
            k7.n7 r1 = p185k7.C3911n7.f16770c
            java.lang.Class r2 = r0.getClass()
            k7.q7 r1 = r1.m8848a(r2)
            r1.mo8684c(r0)
            r0 = 1
            r3.f16454a0 = r0
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r3.f16453Z
            return r0
    }

    /* renamed from: j */
    public void m8203j() {
            r4 = this;
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r4.f16453Z
            r1 = 4
            r2 = 0
            java.lang.Object r0 = r0.mo8189r(r1, r2, r2)
            k7.d6 r0 = (p185k7.AbstractC3773d6) r0
            MessageType extends k7.d6<MessageType, BuilderType> r1 = r4.f16453Z
            k7.n7 r2 = p185k7.C3911n7.f16770c
            java.lang.Class r3 = r0.getClass()
            k7.q7 r2 = r2.m8848a(r3)
            r2.mo8682a(r0, r1)
            r4.f16453Z = r0
            return
    }

    /* renamed from: k */
    public final BuilderType m8204k() {
            r3 = this;
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r3.f16452Y
            r1 = 5
            r2 = 0
            java.lang.Object r0 = r0.mo8189r(r1, r2, r2)
            k7.a6 r0 = (p185k7.C3731a6) r0
            k7.d6 r1 = r3.m8202g()
            r0.m8205m(r1)
            return r0
    }

    /* renamed from: m */
    public final BuilderType m8205m(MessageType r4) {
            r3 = this;
            boolean r0 = r3.f16454a0
            if (r0 == 0) goto La
            r3.m8203j()
            r0 = 0
            r3.f16454a0 = r0
        La:
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r3.f16453Z
            k7.n7 r1 = p185k7.C3911n7.f16770c
            java.lang.Class r2 = r0.getClass()
            k7.q7 r1 = r1.m8848a(r2)
            r1.mo8682a(r0, r4)
            return r3
    }

    /* renamed from: o */
    public final BuilderType m8206o(byte[] r8, int r9, int r10, p185k7.C3948q5 r11) {
            r7 = this;
            boolean r9 = r7.f16454a0
            if (r9 == 0) goto La
            r7.m8203j()
            r9 = 0
            r7.f16454a0 = r9
        La:
            k7.n7 r9 = p185k7.C3911n7.f16770c     // Catch: java.io.IOException -> L24 p185k7.C3897m6 -> L26 java.lang.IndexOutOfBoundsException -> L30
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r7.f16453Z     // Catch: java.io.IOException -> L24 p185k7.C3897m6 -> L26 java.lang.IndexOutOfBoundsException -> L30
            java.lang.Class r0 = r0.getClass()     // Catch: java.io.IOException -> L24 p185k7.C3897m6 -> L26 java.lang.IndexOutOfBoundsException -> L30
            k7.q7 r1 = r9.m8848a(r0)     // Catch: java.io.IOException -> L24 p185k7.C3897m6 -> L26 java.lang.IndexOutOfBoundsException -> L30
            MessageType extends k7.d6<MessageType, BuilderType> r2 = r7.f16453Z     // Catch: java.io.IOException -> L24 p185k7.C3897m6 -> L26 java.lang.IndexOutOfBoundsException -> L30
            h7.vf r6 = new h7.vf     // Catch: java.io.IOException -> L24 p185k7.C3897m6 -> L26 java.lang.IndexOutOfBoundsException -> L30
            r6.<init>(r11)     // Catch: java.io.IOException -> L24 p185k7.C3897m6 -> L26 java.lang.IndexOutOfBoundsException -> L30
            r4 = 0
            r3 = r8
            r5 = r10
            r1.mo8690i(r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L24 p185k7.C3897m6 -> L26 java.lang.IndexOutOfBoundsException -> L30
            return r7
        L24:
            r8 = move-exception
            goto L28
        L26:
            r8 = move-exception
            goto L35
        L28:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "Reading from byte array should not throw IOException."
            r9.<init>(r10, r8)
            throw r9
        L30:
            k7.m6 r8 = p185k7.C3897m6.m8829d()
            throw r8
        L35:
            throw r8
    }
}
