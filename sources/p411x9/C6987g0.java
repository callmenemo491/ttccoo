package p411x9;

/* renamed from: x9.g0 */
/* loaded from: classes.dex */
public final class C6987g0 implements android.os.Parcelable.Creator<p411x9.C6985f0> {
    public C6987g0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p411x9.C6985f0 createFromParcel(android.os.Parcel r18) {
            r17 = this;
            r0 = r18
            int r1 = p270p6.C5368b.m11710t(r18)
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
            r16 = r15
            r14 = 0
        L15:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L89
            int r2 = r18.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 1: goto L7f;
                case 2: goto L75;
                case 3: goto L6f;
                case 4: goto L69;
                case 5: goto L61;
                case 6: goto L5b;
                case 7: goto L55;
                case 8: goto L4f;
                case 9: goto L45;
                case 10: goto L3f;
                case 11: goto L35;
                case 12: goto L2a;
                default: goto L26;
            }
        L26:
            p270p6.C5368b.m11709s(r0, r2)
            goto L15
        L2a:
            android.os.Parcelable$Creator<x9.n> r3 = p411x9.C6995n.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            x9.n r2 = (p411x9.C6995n) r2
            r16 = r2
            goto L15
        L35:
            android.os.Parcelable$Creator<v9.j0> r3 = p375v9.C6605j0.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            v9.j0 r2 = (p375v9.C6605j0) r2
            r15 = r2
            goto L15
        L3f:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r14 = r2
            goto L15
        L45:
            android.os.Parcelable$Creator<x9.h0> r3 = p411x9.C6989h0.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            x9.h0 r2 = (p411x9.C6989h0) r2
            r13 = r2
            goto L15
        L4f:
            java.lang.Boolean r2 = p270p6.C5368b.m11701k(r0, r2)
            r12 = r2
            goto L15
        L55:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r11 = r2
            goto L15
        L5b:
            java.util.ArrayList r2 = p270p6.C5368b.m11696f(r0, r2)
            r10 = r2
            goto L15
        L61:
            android.os.Parcelable$Creator<x9.c0> r3 = p411x9.C6979c0.CREATOR
            java.util.ArrayList r2 = p270p6.C5368b.m11698h(r0, r2, r3)
            r9 = r2
            goto L15
        L69:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r8 = r2
            goto L15
        L6f:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r7 = r2
            goto L15
        L75:
            android.os.Parcelable$Creator<x9.c0> r3 = p411x9.C6979c0.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            x9.c0 r2 = (p411x9.C6979c0) r2
            r6 = r2
            goto L15
        L7f:
            android.os.Parcelable$Creator<h7.me> r3 = p124h7.C2752me.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            h7.me r2 = (p124h7.C2752me) r2
            r5 = r2
            goto L15
        L89:
            p270p6.C5368b.m11699i(r0, r1)
            x9.f0 r0 = new x9.f0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p411x9.C6985f0[] newArray(int r1) {
            r0 = this;
            x9.f0[] r1 = new p411x9.C6985f0[r1]
            return r1
    }
}
