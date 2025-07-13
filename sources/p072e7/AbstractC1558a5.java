package p072e7;

import p072e7.AbstractC1558a5;
import p072e7.AbstractC1800z4;

/* renamed from: e7.a5 */
/* loaded from: classes.dex */
public abstract class AbstractC1558a5<MessageType extends p072e7.AbstractC1558a5<MessageType, BuilderType>, BuilderType extends p072e7.AbstractC1800z4<MessageType, BuilderType>> implements p072e7.InterfaceC1560a7 {
    public int zza;

    public AbstractC1558a5() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            return
    }

    /* renamed from: a */
    int mo4120a() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: b */
    void mo4121b(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // p072e7.InterfaceC1560a7
    /* renamed from: m */
    public final p072e7.AbstractC1638i5 mo4122m() {
            r6 = this;
            r0 = r6
            e7.x5 r0 = (p072e7.AbstractC1783x5) r0     // Catch: java.io.IOException -> L2a
            int r1 = r0.mo4123j()     // Catch: java.io.IOException -> L2a
            e7.i5 r2 = p072e7.AbstractC1638i5.f7635Z     // Catch: java.io.IOException -> L2a
            byte[] r2 = new byte[r1]     // Catch: java.io.IOException -> L2a
            java.util.logging.Logger r3 = p072e7.AbstractC1668l5.f7685a0     // Catch: java.io.IOException -> L2a
            e7.j5 r3 = new e7.j5     // Catch: java.io.IOException -> L2a
            r4 = 0
            r3.<init>(r2, r4, r1)     // Catch: java.io.IOException -> L2a
            r0.m4489d(r3)     // Catch: java.io.IOException -> L2a
            int r0 = r3.m4276K()     // Catch: java.io.IOException -> L2a
            if (r0 != 0) goto L22
            e7.h5 r0 = new e7.h5     // Catch: java.io.IOException -> L2a
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
}
