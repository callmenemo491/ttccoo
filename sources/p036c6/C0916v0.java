package p036c6;

/* renamed from: c6.v0 */
/* loaded from: classes.dex */
public final class C0916v0 implements android.os.Parcelable.Creator<p036c6.C0879d> {
    public C0916v0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0879d createFromParcel(android.os.Parcel r11) {
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
            if (r1 >= r0) goto L55
            int r1 = r11.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            switch(r2) {
                case 2: goto L4f;
                case 3: goto L49;
                case 4: goto L43;
                case 5: goto L3d;
                case 6: goto L37;
                case 7: goto L2d;
                case 8: goto L27;
                case 9: goto L21;
                default: goto L1d;
            }
        L1d:
            p270p6.C5368b.m11709s(r11, r1)
            goto Lc
        L21:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r9 = r1
            goto Lc
        L27:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r8 = r1
            goto Lc
        L2d:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r11, r1, r2)
            android.net.Uri r1 = (android.net.Uri) r1
            r7 = r1
            goto Lc
        L37:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r6 = r1
            goto Lc
        L3d:
            java.util.ArrayList r1 = p270p6.C5368b.m11696f(r11, r1)
            r5 = r1
            goto Lc
        L43:
            android.os.Parcelable$Creator<n6.a> r2 = p233n6.C4691a.CREATOR
            p270p6.C5368b.m11698h(r11, r1, r2)
            goto Lc
        L49:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r4 = r1
            goto Lc
        L4f:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r3 = r1
            goto Lc
        L55:
            p270p6.C5368b.m11699i(r11, r0)
            c6.d r11 = new c6.d
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0879d[] newArray(int r1) {
            r0 = this;
            c6.d[] r1 = new p036c6.C0879d[r1]
            return r1
    }
}
