package p351u4;

/* renamed from: u4.d */
/* loaded from: classes.dex */
public final class C6298d {

    /* renamed from: a */
    public final p351u4.C6299e f24581a;

    /* renamed from: b */
    public final p371v5.C6571u f24582b;

    /* renamed from: c */
    public int f24583c;

    /* renamed from: d */
    public int f24584d;

    /* renamed from: e */
    public boolean f24585e;

    public C6298d() {
            r3 = this;
            r3.<init>()
            u4.e r0 = new u4.e
            r0.<init>()
            r3.f24581a = r0
            v5.u r0 = new v5.u
            r1 = 65025(0xfe01, float:9.112E-41)
            byte[] r1 = new byte[r1]
            r2 = 0
            r0.<init>(r1, r2)
            r3.f24582b = r0
            r0 = -1
            r3.f24583c = r0
            return
    }

    /* renamed from: a */
    public final int m12937a(int r6) {
            r5 = this;
            r0 = 0
            r5.f24584d = r0
        L3:
            int r1 = r5.f24584d
            int r2 = r6 + r1
            u4.e r3 = r5.f24581a
            int r4 = r3.f24588c
            if (r2 >= r4) goto L1b
            int[] r2 = r3.f24591f
            int r3 = r1 + 1
            r5.f24584d = r3
            int r1 = r1 + r6
            r1 = r2[r1]
            int r0 = r0 + r1
            r2 = 255(0xff, float:3.57E-43)
            if (r1 == r2) goto L3
        L1b:
            return r0
    }

    /* renamed from: b */
    public boolean m12938b(p216m4.InterfaceC4365j r7) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            p371v5.C6549a.m13291e(r2)
            boolean r2 = r6.f24585e
            if (r2 == 0) goto L15
            r6.f24585e = r1
            v5.u r2 = r6.f24582b
            r2.m13392B(r1)
        L15:
            boolean r2 = r6.f24585e
            if (r2 != 0) goto L9e
            int r2 = r6.f24583c
            if (r2 >= 0) goto L56
            u4.e r2 = r6.f24581a
            r3 = -1
            boolean r2 = r2.m12941c(r7, r3)
            if (r2 == 0) goto L55
            u4.e r2 = r6.f24581a
            boolean r2 = r2.m12939a(r7, r0)
            if (r2 != 0) goto L30
            goto L55
        L30:
            u4.e r2 = r6.f24581a
            int r3 = r2.f24589d
            int r2 = r2.f24586a
            r2 = r2 & r0
            if (r2 != r0) goto L48
            v5.u r2 = r6.f24582b
            int r2 = r2.f25712c
            if (r2 != 0) goto L48
            int r2 = r6.m12937a(r1)
            int r3 = r3 + r2
            int r2 = r6.f24584d
            int r2 = r2 + r1
            goto L49
        L48:
            r2 = 0
        L49:
            r7.mo9791i(r3)     // Catch: java.io.EOFException -> L4e
            r3 = 1
            goto L4f
        L4e:
            r3 = 0
        L4f:
            if (r3 != 0) goto L52
            return r1
        L52:
            r6.f24583c = r2
            goto L56
        L55:
            return r1
        L56:
            int r2 = r6.f24583c
            int r2 = r6.m12937a(r2)
            int r3 = r6.f24583c
            int r4 = r6.f24584d
            int r3 = r3 + r4
            if (r2 <= 0) goto L93
            v5.u r4 = r6.f24582b
            int r5 = r4.f25712c
            int r5 = r5 + r2
            r4.m13399b(r5)
            v5.u r4 = r6.f24582b
            byte[] r5 = r4.f25710a
            int r4 = r4.f25712c
            r7.readFully(r5, r4, r2)     // Catch: java.io.EOFException -> L76
            r4 = 1
            goto L77
        L76:
            r4 = 0
        L77:
            if (r4 != 0) goto L7a
            return r1
        L7a:
            v5.u r4 = r6.f24582b
            int r5 = r4.f25712c
            int r5 = r5 + r2
            r4.m13395E(r5)
            u4.e r2 = r6.f24581a
            int[] r2 = r2.f24591f
            int r4 = r3 + (-1)
            r2 = r2[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r2 == r4) goto L90
            r2 = 1
            goto L91
        L90:
            r2 = 0
        L91:
            r6.f24585e = r2
        L93:
            u4.e r2 = r6.f24581a
            int r2 = r2.f24588c
            if (r3 != r2) goto L9a
            r3 = -1
        L9a:
            r6.f24583c = r3
            goto L15
        L9e:
            return r0
    }
}
