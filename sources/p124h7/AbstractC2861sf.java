package p124h7;

import p124h7.AbstractC2843rf;
import p124h7.AbstractC2861sf;

/* renamed from: h7.sf */
/* loaded from: classes.dex */
public abstract class AbstractC2861sf<MessageType extends p124h7.AbstractC2861sf<MessageType, BuilderType>, BuilderType extends p124h7.AbstractC2843rf<MessageType, BuilderType>> implements p124h7.InterfaceC2935x {
    public int zza;

    public AbstractC2861sf() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            return
    }

    /* renamed from: a */
    int mo7139a() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: b */
    void mo7140b(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // p124h7.InterfaceC2935x
    /* renamed from: m */
    public final p124h7.AbstractC2574cg mo7141m() {
            r6 = this;
            r0 = r6
            h7.yg r0 = (p124h7.AbstractC2970yg) r0     // Catch: java.io.IOException -> L2a
            int r1 = r0.mo7243k()     // Catch: java.io.IOException -> L2a
            h7.cg r2 = p124h7.AbstractC2574cg.f11427Z     // Catch: java.io.IOException -> L2a
            byte[] r2 = new byte[r1]     // Catch: java.io.IOException -> L2a
            java.util.logging.Logger r3 = p124h7.AbstractC2682ig.f11658c     // Catch: java.io.IOException -> L2a
            h7.fg r3 = new h7.fg     // Catch: java.io.IOException -> L2a
            r4 = 0
            r3.<init>(r2, r4, r1)     // Catch: java.io.IOException -> L2a
            r0.m7334e(r3)     // Catch: java.io.IOException -> L2a
            int r0 = r3.m6722D()     // Catch: java.io.IOException -> L2a
            if (r0 != 0) goto L22
            h7.bg r0 = new h7.bg     // Catch: java.io.IOException -> L2a
            r0.<init>(r2)     // Catch: java.io.IOException -> L2a
            return r0
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L2a
            java.lang.String r1 = "Did not write as much data as expected."
            r0.<init>(r1)     // Catch: java.io.IOException -> L2a
            throw r0     // Catch: java.io.IOException -> L2a
        L2a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Class r2 = r6.getClass()
            java.lang.String r2 = r2.getName()
            int r3 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 72
            r4.<init>(r3)
            java.lang.String r3 = "Serializing "
            java.lang.String r5 = " to a ByteString threw an IOException (should never happen)."
            java.lang.String r2 = p083f.C1932s.m4774a(r4, r3, r2, r5)
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // p124h7.InterfaceC2935x
    /* renamed from: p */
    public final byte[] mo7142p() {
            r6 = this;
            r0 = r6
            h7.yg r0 = (p124h7.AbstractC2970yg) r0     // Catch: java.io.IOException -> L23
            int r1 = r0.mo7243k()     // Catch: java.io.IOException -> L23
            byte[] r2 = new byte[r1]     // Catch: java.io.IOException -> L23
            java.util.logging.Logger r3 = p124h7.AbstractC2682ig.f11658c     // Catch: java.io.IOException -> L23
            h7.fg r3 = new h7.fg     // Catch: java.io.IOException -> L23
            r4 = 0
            r3.<init>(r2, r4, r1)     // Catch: java.io.IOException -> L23
            r0.m7334e(r3)     // Catch: java.io.IOException -> L23
            int r0 = r3.m6722D()     // Catch: java.io.IOException -> L23
            if (r0 != 0) goto L1b
            return r2
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L23
            java.lang.String r1 = "Did not write as much data as expected."
            r0.<init>(r1)     // Catch: java.io.IOException -> L23
            throw r0     // Catch: java.io.IOException -> L23
        L23:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Class r2 = r6.getClass()
            java.lang.String r2 = r2.getName()
            int r3 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 72
            r4.<init>(r3)
            java.lang.String r3 = "Serializing "
            java.lang.String r5 = " to a byte array threw an IOException (should never happen)."
            java.lang.String r2 = p083f.C1932s.m4774a(r4, r3, r2, r5)
            r1.<init>(r2, r0)
            throw r1
    }
}
