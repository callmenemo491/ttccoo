package p375v9;

/* renamed from: v9.h0 */
/* loaded from: classes.dex */
public final class C6601h0 implements android.os.Parcelable.Creator<p375v9.C6586a> {
    public C6601h0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p375v9.C6586a createFromParcel(android.os.Parcel r15) {
            r14 = this;
            int r0 = p270p6.C5368b.m11710t(r15)
            r1 = 0
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r9 = r7
            r11 = r9
            r13 = r11
            r8 = 0
            r10 = 0
            r12 = 0
        L10:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L61
            int r1 = r15.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            switch(r2) {
                case 1: goto L5b;
                case 2: goto L55;
                case 3: goto L4f;
                case 4: goto L49;
                case 5: goto L43;
                case 6: goto L3d;
                case 7: goto L37;
                case 8: goto L31;
                case 9: goto L2b;
                case 10: goto L25;
                default: goto L21;
            }
        L21:
            p270p6.C5368b.m11709s(r15, r1)
            goto L10
        L25:
            java.lang.String r1 = p270p6.C5368b.m11695e(r15, r1)
            r13 = r1
            goto L10
        L2b:
            int r1 = p270p6.C5368b.m11705o(r15, r1)
            r12 = r1
            goto L10
        L31:
            java.lang.String r1 = p270p6.C5368b.m11695e(r15, r1)
            r11 = r1
            goto L10
        L37:
            boolean r1 = p270p6.C5368b.m11700j(r15, r1)
            r10 = r1
            goto L10
        L3d:
            java.lang.String r1 = p270p6.C5368b.m11695e(r15, r1)
            r9 = r1
            goto L10
        L43:
            boolean r1 = p270p6.C5368b.m11700j(r15, r1)
            r8 = r1
            goto L10
        L49:
            java.lang.String r1 = p270p6.C5368b.m11695e(r15, r1)
            r7 = r1
            goto L10
        L4f:
            java.lang.String r1 = p270p6.C5368b.m11695e(r15, r1)
            r6 = r1
            goto L10
        L55:
            java.lang.String r1 = p270p6.C5368b.m11695e(r15, r1)
            r5 = r1
            goto L10
        L5b:
            java.lang.String r1 = p270p6.C5368b.m11695e(r15, r1)
            r4 = r1
            goto L10
        L61:
            p270p6.C5368b.m11699i(r15, r0)
            v9.a r15 = new v9.a
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p375v9.C6586a[] newArray(int r1) {
            r0 = this;
            v9.a[] r1 = new p375v9.C6586a[r1]
            return r1
    }
}
