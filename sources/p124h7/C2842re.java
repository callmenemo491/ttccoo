package p124h7;

/* renamed from: h7.re */
/* loaded from: classes.dex */
public final class C2842re implements android.os.Parcelable.Creator<p124h7.C2824qe> {
    public C2842re() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2824qe createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = p270p6.C5368b.m11710t(r11)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        Lc:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L44
            int r1 = r11.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            switch(r2) {
                case 2: goto L3f;
                case 3: goto L3a;
                case 4: goto L35;
                case 5: goto L30;
                case 6: goto L2b;
                case 7: goto L26;
                case 8: goto L21;
                default: goto L1d;
            }
        L1d:
            p270p6.C5368b.m11709s(r11, r1)
            goto Lc
        L21:
            java.lang.String r9 = p270p6.C5368b.m11695e(r11, r1)
            goto Lc
        L26:
            java.lang.String r8 = p270p6.C5368b.m11695e(r11, r1)
            goto Lc
        L2b:
            java.lang.String r7 = p270p6.C5368b.m11695e(r11, r1)
            goto Lc
        L30:
            java.lang.String r6 = p270p6.C5368b.m11695e(r11, r1)
            goto Lc
        L35:
            java.lang.String r5 = p270p6.C5368b.m11695e(r11, r1)
            goto Lc
        L3a:
            java.lang.String r4 = p270p6.C5368b.m11695e(r11, r1)
            goto Lc
        L3f:
            java.lang.String r3 = p270p6.C5368b.m11695e(r11, r1)
            goto Lc
        L44:
            p270p6.C5368b.m11699i(r11, r0)
            h7.qe r11 = new h7.qe
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2824qe[] newArray(int r1) {
            r0 = this;
            h7.qe[] r1 = new p124h7.C2824qe[r1]
            return r1
    }
}
