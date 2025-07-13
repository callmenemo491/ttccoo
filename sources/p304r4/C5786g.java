package p304r4;

/* renamed from: r4.g */
/* loaded from: classes.dex */
public final class C5786g {

    /* renamed from: a */
    public java.lang.Object f22416a;

    /* renamed from: b */
    public int f22417b;

    public C5786g(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L1b
            r0 = 2
            if (r2 == r0) goto L13
            r1.<init>()
            v5.u r2 = new v5.u
            r0 = 8
            r2.<init>(r0)
            r1.f22416a = r2
            return
        L13:
            r1.<init>()
            i7.v r2 = p145i7.EnumC3113v.f12501Y
            r1.f22416a = r2
            return
        L1b:
            r2 = 32
            r1.<init>(r2, r0)
            return
    }

    public C5786g(int r2, int r3) {
            r1 = this;
            r0 = 3
            if (r3 == r0) goto Lb
            r1.<init>()
            long[] r2 = new long[r2]
            r1.f22416a = r2
            return
        Lb:
            r1.<init>()
            byte[] r2 = new byte[r2]
            r1.f22416a = r2
            r2 = 0
            r1.f22417b = r2
            return
    }

    /* renamed from: a */
    public void m12135a(long r4) {
            r3 = this;
            int r0 = r3.f22417b
            java.lang.Object r1 = r3.f22416a
            r2 = r1
            long[] r2 = (long[]) r2
            int r2 = r2.length
            if (r0 != r2) goto L14
            long[] r1 = (long[]) r1
            int r0 = r0 * 2
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f22416a = r0
        L14:
            java.lang.Object r0 = r3.f22416a
            long[] r0 = (long[]) r0
            int r1 = r3.f22417b
            int r2 = r1 + 1
            r3.f22417b = r2
            r0[r1] = r4
            return
    }

    /* renamed from: b */
    public long m12136b(int r6) {
            r5 = this;
            if (r6 < 0) goto Ld
            int r0 = r5.f22417b
            if (r6 >= r0) goto Ld
            java.lang.Object r0 = r5.f22416a
            long[] r0 = (long[]) r0
            r1 = r0[r6]
            return r1
        Ld:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            int r1 = r5.f22417b
            r2 = 46
            java.lang.String r3 = "Invalid index "
            java.lang.String r4 = ", size is "
            java.lang.String r6 = p304r4.C5785f.m12134a(r2, r3, r6, r4, r1)
            r0.<init>(r6)
            throw r0
    }

    /* renamed from: c */
    public long m12137c(p216m4.InterfaceC4365j r7) {
            r6 = this;
            java.lang.Object r0 = r6.f22416a
            v5.u r0 = (p371v5.C6571u) r0
            byte[] r0 = r0.f25710a
            r1 = 0
            r2 = 1
            r7.mo9795o(r0, r1, r2)
            java.lang.Object r0 = r6.f22416a
            v5.u r0 = (p371v5.C6571u) r0
            byte[] r0 = r0.f25710a
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L1a
            r0 = -9223372036854775808
            return r0
        L1a:
            r3 = 128(0x80, float:1.8E-43)
            r4 = 0
        L1d:
            r5 = r0 & r3
            if (r5 != 0) goto L26
            int r3 = r3 >> 1
            int r4 = r4 + 1
            goto L1d
        L26:
            int r3 = ~r3
            r0 = r0 & r3
            java.lang.Object r3 = r6.f22416a
            v5.u r3 = (p371v5.C6571u) r3
            byte[] r3 = r3.f25710a
            r7.mo9795o(r3, r2, r4)
        L31:
            if (r1 >= r4) goto L43
            int r7 = r0 << 8
            java.lang.Object r0 = r6.f22416a
            v5.u r0 = (p371v5.C6571u) r0
            byte[] r0 = r0.f25710a
            int r1 = r1 + 1
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r7
            goto L31
        L43:
            int r7 = r6.f22417b
            int r4 = r4 + r2
            int r4 = r4 + r7
            r6.f22417b = r4
            long r0 = (long) r0
            return r0
    }

    /* renamed from: d */
    public void m12138d(int r2, boolean r3) {
            r1 = this;
            java.lang.Object r0 = r1.f22416a
            byte[] r0 = (byte[]) r0
            byte r3 = (byte) r3
            r0[r2] = r3
            return
    }

    /* renamed from: e */
    public p145i7.C3110s m12139e() {
            r3 = this;
            i7.s r0 = new i7.s
            int r1 = r3.f22417b
            java.lang.Object r2 = r3.f22416a
            i7.v r2 = (p145i7.EnumC3113v) r2
            r0.<init>(r1, r2)
            return r0
    }
}
