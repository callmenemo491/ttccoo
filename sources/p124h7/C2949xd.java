package p124h7;

/* renamed from: h7.xd */
/* loaded from: classes.dex */
public final class C2949xd implements android.os.Parcelable.Creator<p124h7.C2931wd> {
    public C2949xd() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2931wd createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = p270p6.C5368b.m11710t(r11)
            r1 = 0
            r2 = 0
            r4 = r2
            r6 = r4
            r8 = r6
            r9 = r8
            r5 = 0
            r7 = 0
        Lc:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L49
            int r1 = r11.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            switch(r2) {
                case 2: goto L43;
                case 3: goto L3d;
                case 4: goto L37;
                case 5: goto L31;
                case 6: goto L27;
                case 7: goto L21;
                default: goto L1d;
            }
        L1d:
            p270p6.C5368b.m11709s(r11, r1)
            goto Lc
        L21:
            java.util.ArrayList r1 = p270p6.C5368b.m11696f(r11, r1)
            r9 = r1
            goto Lc
        L27:
            android.os.Parcelable$Creator<h7.gf> r2 = p124h7.C2645gf.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r11, r1, r2)
            h7.gf r1 = (p124h7.C2645gf) r1
            r8 = r1
            goto Lc
        L31:
            boolean r1 = p270p6.C5368b.m11700j(r11, r1)
            r7 = r1
            goto Lc
        L37:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r6 = r1
            goto Lc
        L3d:
            boolean r1 = p270p6.C5368b.m11700j(r11, r1)
            r5 = r1
            goto Lc
        L43:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r4 = r1
            goto Lc
        L49:
            p270p6.C5368b.m11699i(r11, r0)
            h7.wd r11 = new h7.wd
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2931wd[] newArray(int r1) {
            r0 = this;
            h7.wd[] r1 = new p124h7.C2931wd[r1]
            return r1
    }
}
