package p305r5;

/* renamed from: r5.a */
/* loaded from: classes.dex */
public final class C5788a extends p143i5.AbstractC3081e {

    /* renamed from: n */
    public final p371v5.C6571u f22422n;

    public C5788a() {
            r1 = this;
            java.lang.String r0 = "Mp4WebvttDecoder"
            r1.<init>(r0)
            v5.u r0 = new v5.u
            r0.<init>()
            r1.f22422n = r0
            return
    }

    @Override // p143i5.AbstractC3081e
    /* renamed from: j */
    public p143i5.InterfaceC3082f mo7541j(byte[] r9, int r10, boolean r11) {
            r8 = this;
            v5.u r11 = r8.f22422n
            r11.f25710a = r9
            r11.f25712c = r10
            r9 = 0
            r11.f25711b = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        Le:
            v5.u r10 = r8.f22422n
            int r10 = r10.m13398a()
            if (r10 <= 0) goto Lb3
            v5.u r10 = r8.f22422n
            int r10 = r10.m13398a()
            r11 = 8
            if (r10 < r11) goto Lab
            v5.u r10 = r8.f22422n
            int r10 = r10.m13403f()
            v5.u r0 = r8.f22422n
            int r0 = r0.m13403f()
            r1 = 1987343459(0x76747463, float:1.2395323E33)
            if (r0 != r1) goto La2
            v5.u r0 = r8.f22422n
            int r10 = r10 + (-8)
            r1 = 0
            r2 = r1
            r3 = r2
        L38:
            if (r10 <= 0) goto L7f
            if (r10 < r11) goto L77
            int r4 = r0.m13403f()
            int r5 = r0.m13403f()
            int r10 = r10 + (-8)
            int r4 = r4 - r11
            byte[] r6 = r0.f25710a
            int r7 = r0.f25711b
            java.lang.String r6 = p371v5.C6552b0.m13320m(r6, r7, r4)
            r0.m13397G(r4)
            int r10 = r10 - r4
            r4 = 1937011815(0x73747467, float:1.9367696E31)
            if (r5 != r4) goto L65
            r5.e$e r3 = new r5.e$e
            r3.<init>()
            p305r5.C5792e.m12152e(r6, r3)
            i5.a$b r3 = r3.m12156a()
            goto L38
        L65:
            r4 = 1885436268(0x7061796c, float:2.7912367E29)
            if (r5 != r4) goto L38
            java.lang.String r2 = r6.trim()
            java.util.List r4 = java.util.Collections.emptyList()
            android.text.SpannedString r2 = p305r5.C5792e.m12153f(r1, r2, r4)
            goto L38
        L77:
            i5.h r9 = new i5.h
            java.lang.String r10 = "Incomplete vtt cue box header found."
            r9.<init>(r10)
            throw r9
        L7f:
            if (r2 != 0) goto L83
            java.lang.String r2 = ""
        L83:
            if (r3 == 0) goto L8c
            r3.f12403a = r2
            i5.a r10 = r3.m7535a()
            goto L9d
        L8c:
            java.util.regex.Pattern r10 = p305r5.C5792e.f22447a
            r5.e$e r10 = new r5.e$e
            r10.<init>()
            r10.f22462c = r2
            i5.a$b r10 = r10.m12156a()
            i5.a r10 = r10.m7535a()
        L9d:
            r9.add(r10)
            goto Le
        La2:
            v5.u r11 = r8.f22422n
            int r10 = r10 + (-8)
            r11.m13397G(r10)
            goto Le
        Lab:
            i5.h r9 = new i5.h
            java.lang.String r10 = "Incomplete Mp4Webvtt Top Level box header found."
            r9.<init>(r10)
            throw r9
        Lb3:
            j5.e r10 = new j5.e
            r11 = 3
            r10.<init>(r9, r11)
            return r10
    }
}
