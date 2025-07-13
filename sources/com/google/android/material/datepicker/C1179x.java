package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.x */
/* loaded from: classes.dex */
public class C1179x extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.x$a */
    public class a extends androidx.recyclerview.widget.C0612w {
        public a(com.google.android.material.datepicker.C1179x r1, android.content.Context r2) {
                r0 = this;
                r0.<init>(r2)
                return
        }

        @Override // androidx.recyclerview.widget.C0612w
        /* renamed from: f */
        public float mo2022f(android.util.DisplayMetrics r2) {
                r1 = this;
                int r2 = r2.densityDpi
                float r2 = (float) r2
                r0 = 1120403456(0x42c80000, float:100.0)
                float r0 = r0 / r2
                return r0
        }
    }

    public C1179x(android.content.Context r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: K0 */
    public void mo1663K0(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.C0569y r2, int r3) {
            r0 = this;
            com.google.android.material.datepicker.x$a r2 = new com.google.android.material.datepicker.x$a
            android.content.Context r1 = r1.getContext()
            r2.<init>(r0, r1)
            r2.f3281a = r3
            r0.m1862L0(r2)
            return
    }
}
