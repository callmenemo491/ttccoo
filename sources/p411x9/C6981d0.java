package p411x9;

/* renamed from: x9.d0 */
/* loaded from: classes.dex */
public final class C6981d0 implements android.os.Parcelable.Creator<p411x9.C6979c0> {
    public C6981d0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p411x9.C6979c0 createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = p270p6.C5368b.m11710t(r13)
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r10 = 0
        Le:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L53
            int r1 = r13.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            switch(r2) {
                case 1: goto L4d;
                case 2: goto L47;
                case 3: goto L41;
                case 4: goto L3b;
                case 5: goto L35;
                case 6: goto L2f;
                case 7: goto L29;
                case 8: goto L23;
                default: goto L1f;
            }
        L1f:
            p270p6.C5368b.m11709s(r13, r1)
            goto Le
        L23:
            java.lang.String r1 = p270p6.C5368b.m11695e(r13, r1)
            r11 = r1
            goto Le
        L29:
            boolean r1 = p270p6.C5368b.m11700j(r13, r1)
            r10 = r1
            goto Le
        L2f:
            java.lang.String r1 = p270p6.C5368b.m11695e(r13, r1)
            r9 = r1
            goto Le
        L35:
            java.lang.String r1 = p270p6.C5368b.m11695e(r13, r1)
            r6 = r1
            goto Le
        L3b:
            java.lang.String r1 = p270p6.C5368b.m11695e(r13, r1)
            r7 = r1
            goto Le
        L41:
            java.lang.String r1 = p270p6.C5368b.m11695e(r13, r1)
            r8 = r1
            goto Le
        L47:
            java.lang.String r1 = p270p6.C5368b.m11695e(r13, r1)
            r5 = r1
            goto Le
        L4d:
            java.lang.String r1 = p270p6.C5368b.m11695e(r13, r1)
            r4 = r1
            goto Le
        L53:
            p270p6.C5368b.m11699i(r13, r0)
            x9.c0 r13 = new x9.c0
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p411x9.C6979c0[] newArray(int r1) {
            r0 = this;
            x9.c0[] r1 = new p411x9.C6979c0[r1]
            return r1
    }
}
