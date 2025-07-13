package p375v9;

/* renamed from: v9.k0 */
/* loaded from: classes.dex */
public final class C6607k0 implements android.os.Parcelable.Creator<p375v9.C6605j0> {
    public C6607k0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p375v9.C6605j0 createFromParcel(android.os.Parcel r11) {
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
            if (r1 >= r0) goto L4f
            int r1 = r11.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            switch(r2) {
                case 1: goto L49;
                case 2: goto L43;
                case 3: goto L3d;
                case 4: goto L33;
                case 5: goto L2d;
                case 6: goto L27;
                case 7: goto L21;
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
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r7 = r1
            goto Lc
        L33:
            android.os.Parcelable$Creator<h7.if> r2 = p124h7.C2681if.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r11, r1, r2)
            h7.if r1 = (p124h7.C2681if) r1
            r6 = r1
            goto Lc
        L3d:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r5 = r1
            goto Lc
        L43:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r4 = r1
            goto Lc
        L49:
            java.lang.String r1 = p270p6.C5368b.m11695e(r11, r1)
            r3 = r1
            goto Lc
        L4f:
            p270p6.C5368b.m11699i(r11, r0)
            v9.j0 r11 = new v9.j0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p375v9.C6605j0[] newArray(int r1) {
            r0 = this;
            v9.j0[] r1 = new p375v9.C6605j0[r1]
            return r1
    }
}
