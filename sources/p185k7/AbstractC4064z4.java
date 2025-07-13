package p185k7;

import p185k7.AbstractC4051y4;
import p185k7.AbstractC4064z4;

/* renamed from: k7.z4 */
/* loaded from: classes.dex */
public abstract class AbstractC4064z4<MessageType extends p185k7.AbstractC4064z4<MessageType, BuilderType>, BuilderType extends p185k7.AbstractC4051y4<MessageType, BuilderType>> implements p185k7.InterfaceC3802f7 {
    public int zzb;

    public AbstractC4064z4() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            return
    }

    /* renamed from: g */
    public static <T> void m9159g(java.lang.Iterable<T> r6, java.util.List<? super T> r7) {
            java.nio.charset.Charset r0 = p185k7.C3871k6.f16722a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof p185k7.InterfaceC3949q6
            java.lang.String r1 = " is null."
            java.lang.String r2 = "Element at index "
            r3 = 37
            if (r0 == 0) goto L65
            k7.q6 r6 = (p185k7.InterfaceC3949q6) r6
            java.util.List r6 = r6.mo8543g()
            r0 = r7
            k7.q6 r0 = (p185k7.InterfaceC3949q6) r0
            int r7 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L20:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto Lc1
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L55
            int r6 = r0.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            int r6 = r6 - r7
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            int r1 = r0.size()
        L47:
            int r1 = r1 + (-1)
            if (r1 < r7) goto L4f
            r0.remove(r1)
            goto L47
        L4f:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L55:
            boolean r5 = r4 instanceof p185k7.AbstractC3842i5
            if (r5 == 0) goto L5f
            k7.i5 r4 = (p185k7.AbstractC3842i5) r4
            r0.mo8545r(r4)
            goto L20
        L5f:
            java.lang.String r4 = (java.lang.String) r4
            r0.add(r4)
            goto L20
        L65:
            boolean r0 = r6 instanceof p185k7.InterfaceC3898m7
            if (r0 != 0) goto Lc2
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L80
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L80
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r7.size()
            int r5 = r6.size()
            int r5 = r5 + r4
            r0.ensureCapacity(r5)
        L80:
            int r0 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L88:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto Lc1
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto Lbd
            int r6 = r7.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            int r6 = r6 - r0
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            int r1 = r7.size()
        Laf:
            int r1 = r1 + (-1)
            if (r1 < r0) goto Lb7
            r7.remove(r1)
            goto Laf
        Lb7:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        Lbd:
            r7.add(r4)
            goto L88
        Lc1:
            return
        Lc2:
            r7.addAll(r6)
            return
    }

    @Override // p185k7.InterfaceC3802f7
    /* renamed from: b */
    public final p185k7.AbstractC3842i5 mo8541b() {
            r6 = this;
            r0 = r6
            k7.d6 r0 = (p185k7.AbstractC3773d6) r0     // Catch: java.io.IOException -> L2a
            int r1 = r0.mo8495c()     // Catch: java.io.IOException -> L2a
            k7.i5 r2 = p185k7.AbstractC3842i5.f16678Z     // Catch: java.io.IOException -> L2a
            byte[] r2 = new byte[r1]     // Catch: java.io.IOException -> L2a
            java.util.logging.Logger r3 = p185k7.AbstractC3896m5.f16745a0     // Catch: java.io.IOException -> L2a
            k7.k5 r3 = new k7.k5     // Catch: java.io.IOException -> L2a
            r4 = 0
            r3.<init>(r2, r4, r1)     // Catch: java.io.IOException -> L2a
            r0.m8499m(r3)     // Catch: java.io.IOException -> L2a
            int r0 = r3.m8767K()     // Catch: java.io.IOException -> L2a
            if (r0 != 0) goto L22
            k7.f5 r0 = new k7.f5     // Catch: java.io.IOException -> L2a
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

    /* renamed from: f */
    public int mo8497f() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: h */
    public void mo8498h(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    /* renamed from: i */
    public final byte[] m9160i() {
            r6 = this;
            r0 = r6
            k7.d6 r0 = (p185k7.AbstractC3773d6) r0     // Catch: java.io.IOException -> L23
            int r1 = r0.mo8495c()     // Catch: java.io.IOException -> L23
            byte[] r2 = new byte[r1]     // Catch: java.io.IOException -> L23
            java.util.logging.Logger r3 = p185k7.AbstractC3896m5.f16745a0     // Catch: java.io.IOException -> L23
            k7.k5 r3 = new k7.k5     // Catch: java.io.IOException -> L23
            r4 = 0
            r3.<init>(r2, r4, r1)     // Catch: java.io.IOException -> L23
            r0.m8499m(r3)     // Catch: java.io.IOException -> L23
            int r0 = r3.m8767K()     // Catch: java.io.IOException -> L23
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
